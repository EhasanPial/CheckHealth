package com.pialroni.checkhealth;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public abstract class DataRepository implements IDataBase {

    private DatabaseReference mDataRef;
    private ValueEventListener mDataEventListener;
    private final List<UserData> muserDataList;


    public DataRepository() {
        muserDataList = new ArrayList<>();
    }



    @Override
    public void InsertData(UserData userData) {
        //UserData userData1 = new UserData(System.currentTimeMillis() + "", 100, 89, 87, "Hello baby");
        // SimpleDateFormat s = new SimpleDateFormat("ddMMyyyyhhmmss");
        // String format = s.format(new Date());


        String key = mDataRef.push().getKey();
        mDataRef.child(key).setValue(userData);
    }

    @Override
    public void DeleteData(UserData userData) {

    }

    @Override
    public void UpdateData(UserData userData) {

    }

    @Override
    public UserData getData(int id) {
        return null;
    }

    @Override
    public abstract void onCreateDatabase() ;

    @Override
    public abstract List<UserData> getAllData() ;

    @Override
    public abstract void StopDatabase() ;
}
