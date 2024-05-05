package com.wardendev.hillelproject.phones;

import com.wardendev.hillelproject.phones.os.IOS;

public class ApplePhone implements ISmartphone, IOS {

    @Override
    public void call() {
        System.out.println("Calling from iPhone!");
    }

    @Override
    public void sms() {
        System.out.println("Texting an SMS from iPhone!");
    }

    @Override
    public void internet() {
        System.out.println("Accessing the internet from iPhone!");
    }
    
}
