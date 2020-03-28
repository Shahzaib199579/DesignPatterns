public class ShutdownCommand implements Command
{
    Receiver receiver;
    public ShutdownCommand(Receiver r) {
        receiver = r;
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.shutdown();
        receiver.disconnect();
        System.out.println();
    }

}