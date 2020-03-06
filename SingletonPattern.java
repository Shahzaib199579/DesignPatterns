public class SingletonPattern
{
    public static void main(String[] args) {
        
        SingletonDatabase database = new SingletonDatabase("Employee");

        database = database.getInstance("Employee");

        System.out.println("Hello from " + database.getName());

        database = database.getInstance("Product");

        System.out.println("Hello from " + database.getName());
    }
}