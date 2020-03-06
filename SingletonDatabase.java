public class SingletonDatabase
{
    public static SingletonDatabase singleObject;
    private int record;
    private String name;

    public SingletonDatabase(String n) {
        name = n;
        record = 0;
    }

    public void editRecord(String operation)
    {
        System.out.println("Performing a "+ operation +" on record "+ record +" on database "+ name);
    }

    public String getName()
    {
        return name;
    }

    public static SingletonDatabase getInstance(String n)
    {
        if (singleObject == null)
        {
            singleObject = new SingletonDatabase(n);
        }
        
        return singleObject;
    }
}