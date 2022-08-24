package com.pterapan.demotesting;

import java.util.ArrayList;

public class DemoClass {
    public boolean returnPassword(String password) {
        if (password.length() > 4 && password.length() < 16) {
            return true;
        } else {
            return false;
        }
    }

    public String returnUsername() {
        return "JohnDoe";
    }

    public Object[] returnPurchase() {
        Object[] products = {"apple", "milk", "biscuits", "beef"};
        return products;
    }
}
