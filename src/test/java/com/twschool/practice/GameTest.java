package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GameTest {
    Game game = new Game();
    @Test
    public void should_return_error_when_given_1123(){
        //given
        String userAnswer = "1 1 2 3";
        String gameAnswer = "5417";
        //when
        String answerResult = game.game(userAnswer,gameAnswer);
        //then
        Assert.assertEquals(" Wrong Input，Input again",answerResult);
    }

    @Test
    public void should_return_error_when_given_11(){
        //given
        String userAnswer = "1 2";
        String gameAnswer = "5417";
        //when
        String answerResult = game.game(userAnswer,gameAnswer);
        //then
        Assert.assertEquals(" Wrong Input，Input again",answerResult);
    }
}
