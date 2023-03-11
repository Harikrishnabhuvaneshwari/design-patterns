package com.dp.creational.factory;

import com.dp.creational.factory.pattern.Ball;
import com.dp.creational.factory.pattern.BallFactory;
import com.dp.creational.factory.pattern.GMBallFactory;

public class TestFactoryPattern {
    public static void main(String[] args) throws NoSuchMethodException {
        BallFactory ballFactory = new GMBallFactory();
        Ball footBall = ballFactory.createBall("FOOTBALL");
        footBall.created("FOOTBALL");
        Ball volleyBall = ballFactory.createBall("VOLLEY");
        volleyBall.created("VOLLEY BALL");
        Ball ball = ballFactory.createBall("BASKET");
        ball.created("BASKET");
    }
}
