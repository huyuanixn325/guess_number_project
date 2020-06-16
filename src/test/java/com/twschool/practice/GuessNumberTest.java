package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GuessNumberTest {
    Converse converse = new Converse();
    GuessNumber guessNumber = new GuessNumber();
    @Test
    public void should_return_1A3B_when_input_1234_and_1423(){
        //given
        String userAnswer = "1 4 3 2";
        List<String> userAnswerList = converse.converse(userAnswer);
        String gameAnswer = "1234";
        //when
        String answerResult = guessNumber.count(userAnswerList,gameAnswer);
        //then
        Assert.assertEquals("2A2B",answerResult);
    }
}
