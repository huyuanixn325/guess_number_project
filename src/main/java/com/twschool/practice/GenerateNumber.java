package com.twschool.practice;

import java.util.*;

public class GenerateNumber {

    public String generateNumber(int length) {
        String gameNumber = "";
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; stringSet.size()< length; i++){
            int number = (int) (Math.random()*10);
            stringSet.add(String.valueOf(number));
        }
        for (String number:stringSet){
            gameNumber+=number;
        }
        return gameNumber;
    }
}
