package com.twschool.practice;

public class Main {
    private static final int RUN_TIMES = 6;
    public static void main(String[] args) throws Exception {
        GenerateNumber generateNumber = new GenerateNumber();
        String answer = generateNumber.generateNumber(4);
        Game game = new Game();
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            System.out.println(input);
            String result = game.game(answer,input);
            System.out.println(result);
        }
    }
}
