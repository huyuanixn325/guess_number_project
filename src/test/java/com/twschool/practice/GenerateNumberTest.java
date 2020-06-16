package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GenerateNumberTest {
    GenerateNumber generateNumber = new GenerateNumber();
    @Test
    public void should_return_list_when_given_length(){
        //given
        int length = 4;
        //when
        String gameNumber = generateNumber.generateNumber(length);
        //then
        Assert.assertEquals(4,gameNumber.length());
    }
}
