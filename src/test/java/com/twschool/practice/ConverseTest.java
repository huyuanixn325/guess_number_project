package com.twschool.practice;

import jdk.internal.dynalink.linker.LinkerServices;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ConverseTest {
    Converse converse = new Converse();

    @Test
    public void should_return_list_when_given_string(){
        //given
        String userGuessNumber = "1 2 3 4";
        //when
        List<String> userGuessNumberList = converse.converse(userGuessNumber);
        //then
        Assert.assertEquals("1",userGuessNumberList.get(0));
        Assert.assertEquals("4",userGuessNumberList.get(3));
    }

}
