package com.twschool.practice;

public class Game{

    public boolean isValid(String input){
        String[] inputNumbers = input.split(" ");
        if (inputNumbers.length!=4){
            return false;
        }else{
            for(int i = 0;i<inputNumbers.length;i++){
                if(inputNumbers[i].charAt(0)<48||inputNumbers[i].charAt(0)>57){
                    return false;
                }
            }
        }
        return true;
    }
}
