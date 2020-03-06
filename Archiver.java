public class Archiver implements Observer
{

    @Override
    public void update(String operation, String record) {
        
        System.out.println("The archiver Says a " + operation + " operation was performed on "+ record);
    }
    
}