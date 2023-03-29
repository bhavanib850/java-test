package com.test.exceptiontest;

public class StudentNotFoundException extends RuntimeException {

    StudentNotFoundException(String message){
        super(message);
    }
}
