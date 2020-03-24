public class Division
{
    private String name;
    private VP[] vPs = new VP[100];
    private int number = 0;

    public Division(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public void add(String n)
    {
        VP vp = new VP(n, name);
        vPs[number++] = vp;
    }

    public DivisionIterator iterator()
    {
        return new DivisionIterator(vPs);
    }
}