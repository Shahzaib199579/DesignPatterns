public class VP
{
    public String name;
    public String division;

    public VP(String n, String d) {
        name = n;
        division = d;
    }

    public String getName()
    {
        return name;
    }

    public void print()
    {
        System.out.println("Name: "+ name + " Division: "+ division);
    }
}