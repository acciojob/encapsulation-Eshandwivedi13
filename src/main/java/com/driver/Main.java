package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly obj = new RWOnly();
//        obj.name = "ABC";
//        System.out.println(obj.name);//name has private access in com.driver.RWOnly
        obj.setter("ABC");
        System.out.println(obj.getter());
    }
}