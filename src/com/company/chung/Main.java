package com.company.chung;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main<T> {

    RecursiveReflection recursiveReflection = new RecursiveReflection();

    public static void main(String[] args) {
	    Main main1 = new Main();
	    main1.runThis();

    }

    public void runThis(){
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        Test3 test3 = new Test3();
        Test4 test4 = new Test4();
        Test6 test61 = new Test6();
        Test6 test62 = new Test6();
        Test6 test63 = new Test6();

        test2.setStringArray(new String[]{"qqq","wwww","ttt"});
        test2.setThisIsBad("badbadbad");
        test3.setThisFromTest3("wowwowwow");

        test4.setThisIsMyTest4String("heyheyheyhey");
        test4.setSdfsdfsdfdsf("ssdfsdfsdfsdfsdfdfdfsdf");
        test61.setS1("this is 61 s1");
        test61.setS2("this is 61 s2");
        test61.setS3("this is 61 s3");
        test62.setS1("this is 62 s1");
        test62.setS2("this is 62 s2");
        test62.setS3("this is 62 s3");
        test63.setS1("this is 63 s1");
        test63.setS2("this is 63 s2");
        test63.setS3("this is 63 s3");
        ArrayList test6ArrayList = new ArrayList();
        test6ArrayList.add(test61);
        test6ArrayList.add(test62);
        test6ArrayList.add(test63);

        test3.setTest6List(test6ArrayList);
        test4.setTest6Array(new Test6[]{test61,test62,test63});

        test1.setTest2(test2);
        test2.setTest3(test3);
        test3.setTest4(test4);

        String stringMMethods = "test2.test3.test6List";

        getPropertyInfo(Test1.class);

        String[] methodNameArray = stringMMethods.split("\\.");




//    String finalStringValue = (String) recursiveReflection.runReflection(Test1.class, methodNameArray, test1,0);
//    Test6[] finalStringArray = (Test6[]) recursiveReflection.runReflection(Test1.class, methodNameArray, test1,0);
        List<Test6> test6List = (List<Test6>) recursiveReflection.runReflection(Test1.class, methodNameArray, test1,0);

//        HashMap hashMap = new HashMap();
//        hashMap.put("value1",finalStringArray);
//
//        String getThisValue = "s2";
//        String[] methodNameArray2 = getThisValue.split("\\.");
//
//        for(Test6 t6:finalStringArray){
//            String s = (String)recursiveReflection.runReflection(Test6.class,methodNameArray2,t6,0);
//            System.out.println("s: "+s);
//        }
//        Arrays.stream(finalStringArray).forEach(s->System.out.println(s.getS1()));
    }

    public static String getUpperCase(String s){
        return s.substring(0,1).toUpperCase()+s.substring(1,s.length());
    }

    public static void getPropertyInfo(Class myClass){
        Field[] fields = myClass.getDeclaredFields();
        for(Field f:fields){
            Class obj = f.getType();
            System.out.println("f.getName(): "+f.getName());
        }
    }


//    public void print(T[] array){
//        String[] methodNameArray2 = getThisValue.split("\\.");
//        for(T t:array){
//            String s = (String)recursiveReflection.runReflection(((SuperTest)t).getThisClass(),methodNameArray2,((SuperTest)t).getInstanceClass(),0);
//            System.out.println("s: "+s);
//        }
//    }
}
