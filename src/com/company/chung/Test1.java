package com.company.chung;

public class Test1 extends SuperTest{


    private Test2 test2;


    public Test2 getTest2() {
        return test2;
    }

    public void setTest2(Test2 test2) {
        this.test2 = test2;
    }

    @Override
    public Test1 getInstanceClass(){
        return this;
    }

    @Override
    public Class<Test1> getThisClass(){
        return Test1.class;
    }
}
