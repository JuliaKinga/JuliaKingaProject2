package com.fast;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Random {

    public static String randomTextNine() {
         return RandomStringUtils.random(9,"abcdefghijklmn");
    }

    public static int randomNumbers(int number1, int number2){
        return RandomUtils.nextInt(number1,number2);
    }

    public static String randomEmail(){
        return randomTextNine() + "@abcd.com";
    }
}
