public class RunDiagnosticsCommand implements Command {
    Receiver receiver;

    public RunDiagnosticsCommand(Receiver r) {
        receiver = r;
    }

    public void execute() {
        receiver.connect();
        receiver.diagnostics();
        receiver.disconnect();
        System.out.println();
    }
}