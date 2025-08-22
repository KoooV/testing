package com.kov.testing.testingClases;

public class Strings {
    public String reverse(String str) {
        if(str == null || str.isEmpty()){
            return "";

        }
        StringBuilder result = new StringBuilder(str)
                    .reverse();
        return result.toString();
        }
    }


