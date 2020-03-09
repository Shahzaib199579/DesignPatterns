public class CookieRobot extends RobotTemplate
{
    private String name;

    public CookieRobot(String n) {
        name = n;
    }

    @Override
    public void getParts()
    {
        System.out.println("Getting a sugar and flour...");
    }

    @Override
    public void assemble()
    {
        System.out.println("Baking a cookie...");
    }

    @Override
    public void test()
    {
        System.out.println("Cunching a cookie....");
    }

    public String getName()
    {
        return name;
    }
}