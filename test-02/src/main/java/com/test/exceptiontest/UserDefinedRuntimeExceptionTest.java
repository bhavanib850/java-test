package com.test.exceptiontest;

public class UserDefinedRuntimeExceptionTest {
    public static void main(String... arg) {
            String id=null;
            try {
                if(id==null) {
                    throw new StudentNotFoundException("Student not found");
                }
            }catch (StudentNotFoundException e){
                System.out.println("error:::::::"+e.getMessage());
            }

        System.out.println(" after catch");

        }


}
