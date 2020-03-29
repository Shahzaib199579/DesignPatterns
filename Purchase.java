import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Purchase
{
    Mediator mediator;
    String response = "n";

    public Purchase(Mediator m) {
        mediator = m;
    }

    public void go()
    {
        System.out.print("Do you want to buy? [y/n]? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            response = reader.readLine();
        }catch (IOException ioe) {
            System.err.println("Error");
        }

        if (response.equals("y"))
        {
            System.out.println("Thank you for purchasing.");
        }
        
        mediator.handle("purchase.exit");
    }
}