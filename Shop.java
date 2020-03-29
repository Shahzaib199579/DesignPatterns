import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shop
{
    Mediator mediator;
    String response = "n";

    public Shop(Mediator m) {
        mediator = m;
    }

    public void go()
    {
        System.out.print("Do you want to purchase? [y/n]? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            response = reader.readLine();
        }catch (IOException ioe) {
            System.err.println("Error");
        }

        if (response.equals("y"))
        {
            mediator.handle("shop.purchase");
        }
        else
        {
            mediator.handle("shop.exit");
        }
    }
}