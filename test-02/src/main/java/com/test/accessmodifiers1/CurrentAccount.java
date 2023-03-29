package com.test.accessmodifiers1;

import com.test.accessmodifiers.Account;

public class CurrentAccount extends Account {
    @Override
    public int getAccountInfo(){
        return 20000;
    }
}
