public class RubberDuck extends Duck{

    public RubberDuck()
    {

    }

    @Override
    public void quack()
    {
        System.out.println("Squeak");
    }

    @Override
    public void display()
    {
        System.out.println("I'm a rubber duck");
    }
}
