package com.company.chung;

import java.util.List;

public class Test3 extends SuperTest  {

    private String thisFromTest3;
    private Test4 test4;
    private List<Test6> test6List;

    public List<Test6> getTest6List() {
        return test6List;
    }

    public void setTest6List(List<Test6> test6List) {
        this.test6List = test6List;
    }

    public String getThisFromTest3() {
        return thisFromTest3;
    }

    public Test4 getTest4() {
        return test4;
    }

    public void setTest4(Test4 test4) {
        this.test4 = test4;
    }

    public void setThisFromTest3(String thisFromTest3) {
        this.thisFromTest3 = thisFromTest3;
    }

    @Override
    public Object getInstanceClass() {
        return this;
    }

    @Override
    public Class getThisClass() {
        return Test3.class;
    }
}
