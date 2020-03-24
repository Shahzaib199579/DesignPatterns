import javax.swing.text.html.HTMLDocument.Iterator;

public class Division extends Corporate
{
    private String name;
    private Corporate[] corporate = new Corporate[100];
    private int number = 0;

    public Division(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public void add(Corporate c)
    {
        corporate[number++] = c;
    }

    public DivisionIterator iterator()
    {
        return new DivisionIterator(corporate);
    }

    public void print()
    {
        java.util.Iterator i = iterator();

        while(i.hasNext())
        {
            Corporate c = (Corporate) i.next();
            c.print();
        }
    }
}