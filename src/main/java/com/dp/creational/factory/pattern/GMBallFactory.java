package com.dp.creational.factory.pattern;

public class GMBallFactory implements BallFactory {

    @Override
    public Ball createBall(String ballType) throws NoSuchMethodException {

        Ball ball;
        return switch (ballType) {
            case "FOOTBALL" -> {
                ball = new FootBall();
                ball.design();
                yield ball;
            }
            case "CRICKET" -> {
                ball = new CricketBall();
                ball.design();
                yield ball;
            }
            case "VOLLEY" -> {
                ball = new VolleyBall();
                ball.design();
                yield ball;
            }
            default -> throw new NoSuchMethodException();
        };

    }

}
