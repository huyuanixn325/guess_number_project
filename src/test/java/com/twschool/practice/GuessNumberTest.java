package com.twschool.practice;

import org.junit.Test;

public class GuessNumberTest {
    Converse converse = new Converse();
    GuessNumber guessNumber = new GuessNumber();
    @Test
    public void should_return_1A3B_when_input_1234_and_1423(){
        //given
        String userAnswer = "1 4 3 2";
        String gameAnswer = "1 2 3 4";
        //when
        guessNumber.count();
    }
}
