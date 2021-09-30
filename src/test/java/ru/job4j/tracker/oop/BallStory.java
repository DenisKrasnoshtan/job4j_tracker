package ru.job4j.tracker.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(ball);
        ball.tryRun(false);
        wolf.tryEat(ball);
        ball.tryRun(false);
        fox.tryEat(ball);
        ball.tryRun(true);

    }
}
