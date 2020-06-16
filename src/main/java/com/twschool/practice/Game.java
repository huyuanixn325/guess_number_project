package com.twschool.practice;

import java.util.List;

public class Game{
    public String game(String gameAnswer,String inputLine){
        boolean isValid = isValid(inputLine);
        Converse converse = new Converse();
        GuessNumber guessNumber = new GuessNumber();
        if (isValid) {
            List<String> inputList = converse.converse(inputLine);
            return guessNumber.count(inputList,gameAnswer);
        }else {
            return " Wrong Input，Input again";
        }
    }
    public boolean isValid(String input){
        String[] inputNumbers = input.split(" ");
        if (inputNumbers.length!=4){
            return false;
        }else{
            for(int i = 0;i<inputNumbers.length;i++){
                if(inputNumbers[i].charAt(0)<48||inputNumbers[i].charAt(0)>57){
                    return false;
                }
                for(int j = i+1; j<inputNumbers.length;j++){
                    if (inputNumbers[i].equals(inputNumbers[j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
