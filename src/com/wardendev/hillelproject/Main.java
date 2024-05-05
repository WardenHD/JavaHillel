package com.wardendev.hillelproject;

import com.wardendev.hillelproject.phones.*;

public class Main {
    public static void main(String[] args) {
        for (Phones phone : Phones.values()) {
            phone.type.call();
            phone.type.sms();
            phone.type.internet();
        }
    }

    private enum Phones {
        IPHONE_XR(new ApplePhone()),
        PIXEL_7A(new AndroidPhone());

        private final ISmartphone type;

        Phones(ISmartphone type) {
            this.type = type;
        }
    }
}
