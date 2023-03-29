package com.test.exceptiontest;

public class UserDefinedCompileTimeExceptionTest {
    public static void main(String... arg) {
            String id=null;
            try {
                if(id==null) {
                    throw new ValidationException("validation fail");
                }
            }catch (ValidationException e){
                System.out.println("error:::::::"+e.getMessage());
            }

        System.out.println(" after catch");

        }


}
