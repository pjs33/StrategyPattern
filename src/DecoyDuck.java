public class DecoyDuck extends Duck
{
    public DecoyDuck()
    {

    }

    @Override
    public void fly()
    {
        System.out.println("I can't fly");
    }

    @Override
    public void quack()
    {
        System.out.println("<< Silence >>");
    }

    @Override
    public void display()
    {
        System.out.println("I'm a decoy duck");
    }
}
