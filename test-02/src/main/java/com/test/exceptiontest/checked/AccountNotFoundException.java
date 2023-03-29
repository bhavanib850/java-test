package com.test.exceptiontest.checked;

public class AccountNotFoundException extends RuntimeException {
    AccountNotFoundException(String message){
        super(message);

    }

}
