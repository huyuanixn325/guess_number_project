package com.twschool.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateNumber {
    Random random = new Random(1);

    public List<String> generateNumber(int length) {
        List<String> gameNumberList = new ArrayList<>();
        for (int i = 0; i< length; i++){
            int number = random.nextInt(10);
            gameNumberList.add(String.valueOf(number));
        }
        return gameNumberList;
    }
}
