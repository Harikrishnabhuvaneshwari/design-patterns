package com.dp.creational.factory.pattern;

public interface BallFactory {

    Ball createBall(String ballType) throws NoSuchMethodException;

}
