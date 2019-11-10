package com.acelik.utilities;

public class StringUtility {

    public void verifyEquals(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
