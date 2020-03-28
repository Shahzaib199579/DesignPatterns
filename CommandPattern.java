public class CommandPattern
{
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        AsiaServer asiaServer = new AsiaServer();
        EuroServer euroServer = new EuroServer();
        USServer usServer = new USServer();

        ShutdownCommand shutdownAsia = new ShutdownCommand(asiaServer);
        ShutdownCommand shutdownEuro = new ShutdownCommand(euroServer);
        ShutdownCommand shutdownUS = new ShutdownCommand(usServer);

        invoker.setCommand(shutdownAsia);
        invoker.run();

        invoker.setCommand(shutdownEuro);
        invoker.run();

        invoker.setCommand(shutdownUS);
        invoker.run();
    }
}