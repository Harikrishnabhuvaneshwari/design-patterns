package com.dp.creational.factory.pattern;

public class CricketBall implements Ball{
    @Override
    public void design() {
        System.out.println("Designing Cricket ball...");
    }

    @Override
    public void created(String ball){
        Ball.super.created(ball);
    }
}
