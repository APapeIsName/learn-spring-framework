package com.apape.learn_spring_framework.game;

public class App01GamingBasicJava {
    public static void main(String [] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
