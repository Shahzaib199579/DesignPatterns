public class SingletonPattern
{
    public static void main(String[] args) {
        
        SingletonDatabase database;

        database = SingletonDatabase.getInstance("Employee");

        System.out.println("Hello from " + database.getName());

        database = SingletonDatabase.getInstance("Product");

        System.out.println("Hello from " + database.getName());
    }
}