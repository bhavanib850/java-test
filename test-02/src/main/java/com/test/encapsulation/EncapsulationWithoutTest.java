package com.test.encapsulation;

class Employee1{
    String id;  //No encapsulation - field isn’t private

    void show(){
        System.out.println(id);
    }
}

public class EncapsulationWithoutTest {
    public static void main(String[] args) {
        Employee1 emp=new Employee1();
        emp.id="1";
        emp.show();

    }

}
