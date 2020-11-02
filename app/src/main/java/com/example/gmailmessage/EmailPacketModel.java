package com.example.gmailmessage;

public class EmailPacketModel {
//    int color;
    String string;
    String subString;
    String time;

    public EmailPacketModel(String string, String subString, String time){
        this.string = string;
        this.subString = subString;
        this.time = time;
    }

    public String getString(){
        return this.string;
    }

    public String getSubString(){
        return this.subString;
    }

    public String getTime(){
        return this.time;
    }
}
