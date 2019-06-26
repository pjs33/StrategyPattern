package ducks;

import behaviors.fly.FlyWithWings;
import behaviors.quack.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Redhead duck");
    }
}
