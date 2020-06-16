package com.twschool.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateNumber {
    Random random = new Random(1);

    public String generateNumber(int length) {
        String gameNumber = "";
        for (int i = 0; i< length; i++){
            int number = random.nextInt(10);
            gameNumber+=number;
        }
        return gameNumber;
    }
}
