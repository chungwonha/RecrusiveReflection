package com.company.chung;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class RecursiveReflection<T> {

    public T runReflection(Class object, String[] methodNames, Object instanceClass,int index){
        try {
            Method getTest2Method = object.getDeclaredMethod("get"+getUpperCase(methodNames[index]));
            T objectReturnedFromInvokedMethod = (T)getTest2Method.invoke(instanceClass);
            System.out.println(objectReturnedFromInvokedMethod);
            index=index+1;
            if(objectReturnedFromInvokedMethod instanceof SuperTest){

                return runReflection(((SuperTest) objectReturnedFromInvokedMethod).getThisClass(),methodNames,((SuperTest) objectReturnedFromInvokedMethod).getInstanceClass(),index);

            }else {
                return objectReturnedFromInvokedMethod;
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getUpperCase(String s){
        return s.substring(0,1).toUpperCase()+s.substring(1,s.length());
    }

    public void getPropertyInfo(Class myClass){
        Field[] fields = myClass.getDeclaredFields();
        for(Field f:fields){
            Class obj = f.getType();
            System.out.println("f.getName(): "+f.getName());
        }
    }

}
