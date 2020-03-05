public class FactoryDesignPattern
{
    public static void main(String[] args) {
        
        FirstFactory factory = new FirstFactory("Sql Server");

        Connection connection = factory.CreateConnection();

        System.out.println("You are connecting to " + connection.description());
    }
}