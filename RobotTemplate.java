public abstract class RobotTemplate
{
    public void go()
    {
        start();
        getParts();
        assemble();
        test();
        stop();
    }

    public void start()
    {
        System.out.println("Starting......");
    }

    public void getParts()
    {
        System.out.println("Getting part...");
    }
    
    public void assemble()
    {
        System.out.println("assembling...");
    }

    public void test()
    {
        System.out.println("Reviving up....");
    }

    public void stop()
    {
        System.out.println("Stopping...");
    }
}