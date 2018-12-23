package com.example.sith3.myapplication;

public class UserModel {

    public String txt1,txt2;
    public UserModel(){

    }
    public UserModel(String val1,String val2){
        txt1 = val1;
        txt2 = val2;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }
}
