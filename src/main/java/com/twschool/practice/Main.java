package com.twschool.practice;

public class Main {
    private static final int RUN_TIMES = 6;
    public static void main(String[] args) throws Exception {
        GenerateNumber generateNumber = new GenerateNumber();
        String answer = generateNumber.generateNumber(4);
        String history = "";
        Game game = new Game();
        for (int i = 0; i < RUN_TIMES; i++) {
            if (i==0) history="";
            String input = new GuessInputCommand().input();
            history=history+input+"\n";
            System.out.println(input);
            String result = game.game(answer,input);
            System.out.println(result);
            System.out.println("你输入的历史纪录：\n"+history);
            if (result.contains("4A0B")) break;
        }
    }
}
