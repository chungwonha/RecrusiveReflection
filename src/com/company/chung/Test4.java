package com.company.chung;

public class Test4 extends SuperTest {

    private String thisIsMyTest4String;
    private String sdfsdfsdfdsf;
    private Test6[] test6Array;

    public Test6[] getTest6Array() {
        return test6Array;
    }

    public void setTest6Array(Test6[] test6Array) {
        this.test6Array = test6Array;
    }

    public String getSdfsdfsdfdsf() {
        return sdfsdfsdfdsf;
    }

    public void setSdfsdfsdfdsf(String sdfsdfsdfdsf) {
        this.sdfsdfsdfdsf = sdfsdfsdfdsf;
    }

    public String getThisIsMyTest4String() {
        return thisIsMyTest4String;
    }

    public void setThisIsMyTest4String(String thisIsMyTest4String) {
        this.thisIsMyTest4String = thisIsMyTest4String;
    }

    @Override
    public Object getInstanceClass() {
        return this;
    }

    @Override
    public Class getThisClass() {
        return Test4.class;
    }
}
