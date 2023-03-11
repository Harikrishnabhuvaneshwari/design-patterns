package com.dp.creational.factory.pattern;

public class VolleyBall implements Ball {
    @Override
    public void design() {
        System.out.println("Designing Volleyball...");
    }

    @Override
    public void created(String ball) {
        Ball.super.created(ball);
    }
}
