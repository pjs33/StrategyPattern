import behaviors.fly.FlyRocketPowered;
import ducks.*;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Duck> duckList = new LinkedList<>();
        duckList.add(new MallardDuck());
        duckList.add(new RedheadDuck());
        duckList.add(new RubberDuck());
        duckList.add(new DecoyDuck());

        for (Duck duck : duckList) {
            System.out.println("**** " + duck.getClass() + " ****");
            printDisplayMethod(duck);
            printQuackMethod(duck);
            printSwimMethod(duck);
            printFlyMethod(duck);
            System.out.println();
        }

        Duck modelDuck = new ModelDuck();
        System.out.println("**** Dynamically changing fly behavior at runtime ****");
        System.out.println("**** " + modelDuck.getClass() + " ****");
        printFlyMethod(modelDuck);
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        printFlyMethod(modelDuck);
    }

    private static void printDisplayMethod(Duck duck) {
        System.out.print("Display method: ");
        duck.display();
    }

    private static void printQuackMethod(Duck duck) {
        System.out.print("Quack method: ");
        duck.performQuack();
    }

    private static void printSwimMethod(Duck duck) {
        System.out.print("Swim method: ");
        duck.swim();
    }

    private static void printFlyMethod(Duck duck) {
        System.out.print("Fly method: ");
        duck.performFly();
    }
}
