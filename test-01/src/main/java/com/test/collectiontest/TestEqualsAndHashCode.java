package com.test.collectiontest;

import java.util.HashMap;

public class TestEqualsAndHashCode {
    public static void main(String[] args) {
        HashMap<Employee,String> hm=new HashMap<Employee,String>();
        hm.put(new Employee(1,"sam"), "employee1 data");
        hm.put(new Employee(2,"amy"), "employee2 data");
        System.out.println("HashMap's data> "+hm);
        hm.put(new Employee(1,"sam"),"employee1 data OVERRIDDEN");
        System.out.println(hm.get(new Employee(1,"sam")));
    }
}
