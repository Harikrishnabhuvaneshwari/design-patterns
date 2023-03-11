package com.dp.creational.factory.pattern;

public class FootBall implements Ball {

    @Override
    public void design() {
        System.out.println("Designing Football...");
    }

    @Override
    public void created(String ball) {
        Ball.super.created(ball);
    }
}
