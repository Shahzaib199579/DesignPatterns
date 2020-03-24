import java.util.ArrayList;
import java.util.Iterator;

public class Corporation extends Corporate
{
    private ArrayList<Corporate> corporate = new ArrayList<Corporate>();

    public void add(Corporate c)
    {
        corporate.add(c);
    }

    public void print()
    {
        Iterator i = corporate.iterator();

        while(i.hasNext())
        {
            Corporate c = (Corporate) i.next();
            c.print();
        }
    }
}