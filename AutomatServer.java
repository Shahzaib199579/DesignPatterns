import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class AutomatServer implements Runnable, AutomatInterface
{
    State waitingState;
    State gotApplicationState;
    State apartmentRentedState;
    State fullyRentedState;
    State state;
    int count;
    private Thread thread;
    ServerSocket socket;
    PrintWriter out;
    Socket communationSocket;

    public AutomatServer() {
        count = 9;
        waitingState = new WaitingState(this);
        gotApplicationState = new GotApplicationState(this);
        apartmentRentedState = new ApartmentRentedState(this);
        fullyRentedState = new FullyRentedState(this);
        state = waitingState;

        try {
            
            socket = new ServerSocket(8765);
            communationSocket = socket.accept();

            out = new PrintWriter(communationSocket.getOutputStream(), true);

            thread = new Thread(this);
            thread.start();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void gotApplication() {
        out.println(state.gotApplication());

    }

    @Override
    public void checkApplication() {
        out.println(state.checkApplication());

    }

    @Override
    public void rentApartment() {
        out.println(state.rentApartment());
        out.println(state.dispenseKeys());
    }

    @Override
    public void setState(State s) {
        state = s;

    }

    @Override
    public State getWaitingState() {
        return waitingState;
    }

    @Override
    public State getGotApplicationState() {
        return gotApplicationState;
    }

    @Override
    public State getApartmentRentedState() {
        return apartmentRentedState;
    }

    @Override
    public State getFullyRentedState() {
        return fullyRentedState;
    }

    @Override
    public int getCount() {
       return count;
    }

    @Override
    public void setCount(int n) {
        count = n;

    }

    @Override
    public void run() {
        
        String incomingString;

        try {
            
            BufferedReader in = new BufferedReader(new InputStreamReader(communationSocket.getInputStream()));

            while ((incomingString = in.readLine()) != null)
            {
                if (incomingString.equals("gotApplication"))
                {
                    gotApplication();
                }
                else if(incomingString.equals("checkApplication"))
                {
                    checkApplication();
                }
                else if(incomingString.equals("rentApartment"))
                {
                    rentApartment();
                }
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        AutomatServer server = new AutomatServer();
    }
    
}