package com.test.exceptiontest.checked;

public class UserDefinedRuntimeExceptionTest1 {
    public static void main(String[] args) {
        String id=null;
        try {
            if (id == null) {
                throw new AccountNotFoundException("Account is not valid");
            }
        }catch (AccountNotFoundException e){
            System.out.println("error:::::::::::"+e.getMessage());
            }
        System.out.println();
        }
    }

