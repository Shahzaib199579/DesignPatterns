public class Boss implements Observer
{

    @Override
    public void update(String operation, String record) {
        System.out.println("The Boss says a "+ operation +" operation was performed on "+ record);

    }
    
}