package com.pialroni.checkhealth;


import java.util.List;

public interface IDataBase {


    void InsertData(UserData userData);

    void DeleteData(UserData userData);

    void UpdateData(UserData userData);

    com.pialroni.checkhealth.UserData getData(int id);

    void onCreateDatabase();

    List<com.pialroni.checkhealth.UserData> getAllData();

    void StopDatabase();

    // TEST

}