package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GuessNumberTest {
    Converse converse = new Converse();
    GuessNumber guessNumber = new GuessNumber();
    @Test
    public void should_return_2A2B_when_given_1234_and_1423(){
        //given
        String userAnswer = "1 4 3 2";
        List<String> userAnswerList = converse.converse(userAnswer);
        String gameAnswer = "1234";
        //when
        String answerResult = guessNumber.count(userAnswerList,gameAnswer);
        //then
        Assert.assertEquals("2A2B",answerResult);
    }

    @Test
    public void should_return_4A0B_when_given_1234_and_1234(){
        //given
        String userAnswer = "1 2 3 4";
        List<String> userAnswerList = converse.converse(userAnswer);
        String gameAnswer = "1234";
        //when
        String answerResult = guessNumber.count(userAnswerList,gameAnswer);
        //then
        Assert.assertEquals("4A0B",answerResult);
    }

    @Test
    public void should_return_0A4B_when_given_1234_and_4321(){
        //given
        String userAnswer = "1 2 3 4";
        List<String> userAnswerList = converse.converse(userAnswer);
        String gameAnswer = "4321";
        //when
        String answerResult = guessNumber.count(userAnswerList,gameAnswer);
        //then
        Assert.assertEquals("0A4B",answerResult);
    }
}
