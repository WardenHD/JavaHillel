package com.wardendev.hillelproject.phones;

import com.wardendev.hillelproject.phones.os.LinuxOS;

public class AndroidPhone implements ISmartphone, LinuxOS {

    @Override
    public void call() {
        System.out.println("Calling from Android!");
    }

    @Override
    public void sms() {
        System.out.println("Texting an SMS from Android!");
    }

    @Override
    public void internet() {
        System.out.println("Accessing the internet from Android!");
    }
}
