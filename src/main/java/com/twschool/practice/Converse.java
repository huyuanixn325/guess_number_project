package com.twschool.practice;

import java.util.ArrayList;
import java.util.List;

public class Converse {
    public List<String> converse(String userGuessAnswer) {
        List<String> inputList = new ArrayList<>();

        String[] guestNumbers = userGuessAnswer.split(" ");

        for (int i=0;i<guestNumbers.length;i++){
            inputList.add(guestNumbers[i]);
        }
        return inputList;
    }
}
