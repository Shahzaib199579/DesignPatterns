public class AutomativeRobot extends RobotTemplate
{
    private String name;

    public AutomativeRobot(String n) {
        name = n;
    }

    @Override
    public void getParts()
    {
        System.out.println("Getting a carbourator...");
    }

    @Override
    public void assemble()
    {
        System.out.println("installing carbourator...");
    }

    @Override
    public void test()
    {
        System.out.println("Reviving up the engine....");
    }

    public String getName()
    {
        return name;
    }
}