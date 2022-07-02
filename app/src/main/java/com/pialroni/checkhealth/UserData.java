package com.pialroni.checkhealth;

public class UserData {
    public UserData() {
    }

    private String timestamp;
    private int Systolic;
    private int Diastolic;
    private int heartRate;
    private String Comment;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getSystolic() {
        return Systolic;
    }

    public void setSystolic(int systolic) {
        Systolic = systolic;
    }

    public int getDiastolic() {
        return Diastolic;
    }

    public void setDiastolic(int diastolic) {
        Diastolic = diastolic;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public UserData(String timestamp, int systolic, int diastolic, int heartRate, String comment) {
        this.timestamp = timestamp;
        Systolic = systolic;
        Diastolic = diastolic;
        this.heartRate = heartRate;
        Comment = comment;
    }

    // Hello
}
