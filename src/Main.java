import java.util.LinkedList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Duck> duckList = new LinkedList<>();
        duckList.add(new MallardDuck());
        duckList.add(new RedheadDuck());
        duckList.add(new RubberDuck());
        duckList.add(new DecoyDuck());

        for (Duck duck : duckList)
        {
            System.out.println("**** " + duck.getClass() + " ****");
            System.out.print("Display method: ");
            duck.display();
            System.out.print("Quack method: ");
            duck.quack();
            System.out.print("Swim method: ");
            duck.swim();
            System.out.print("Fly method: ");
            duck.fly();
            System.out.println();
        }
    }
}
