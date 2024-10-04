package com.crud.customer.GLOBAL.utils;

public class Operation {
    public static String trimBrackets(String message){
        return message.replaceAll("[\\[\\]]" ,"");
    }
}
