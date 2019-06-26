public class RedheadDuck extends Duck implements Flyable, Quackable
{
    public RedheadDuck()
    {

    }

    @Override
    public void fly()
    {
        System.out.println("I'm flying!!");
    }

    @Override
    public void quack()
    {
        System.out.println("Quack");
    }

    @Override
    public void display()
    {
        System.out.println("I'm a real Redhead duck");
    }
}
