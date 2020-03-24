public class FacadePattern
{
    public static void main(String[] args) {
        
        SimpleProductFacade simpleProductFacade = new SimpleProductFacade();

        simpleProductFacade.setName("Printer");

        System.out.println("The product is a "+ simpleProductFacade.getName());
    }
}