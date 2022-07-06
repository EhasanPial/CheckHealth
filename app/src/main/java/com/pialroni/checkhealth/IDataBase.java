package com.pialroni.checkhealth;

import android.service.autofill.UserData;

import java.util.List;

public interface IDataBase {


    void InsertData(UserData userData);

    void DeleteData(UserData userData);

    void UpdateData(UserData userData);

    UserData getData(int id);

    void onCreateDatabase();

    List<UserData> getAllData();

    void StopDatabase();

    // TEST

}