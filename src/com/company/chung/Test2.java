package com.company.chung;

public class Test2 extends SuperTest{

    private String thisIsGood;
    private String thisIsBad;
    private Test3 test3;
    private String[] stringArray;

    public String[] getStringArray() {
        return stringArray;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public String getThisIsGood() {
        return thisIsGood;
    }

    public void setThisIsGood(String thisIsGood) {
        this.thisIsGood = thisIsGood;
    }

    public String getThisIsBad() {
        return thisIsBad;
    }

    public Test3 getTest3() {
        return test3;
    }

    public void setTest3(Test3 test3) {
        this.test3 = test3;
    }

    public void setThisIsBad(String thisIsBad) {
        this.thisIsBad = thisIsBad;
    }

    @Override
    public Test2 getInstanceClass(){
        return this;
    }

    @Override
    public Class<Test2> getThisClass(){
        return Test2.class;
    }
}
