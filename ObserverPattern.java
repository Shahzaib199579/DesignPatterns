public class ObserverPattern
{
    public static void main(String[] args) {
        
        Database database = new Database();
        Client client = new Client();
        Boss boss = new Boss();
        Archiver archiver = new Archiver();

        database.registerObserver(client);
        database.registerObserver(boss);
        database.registerObserver(archiver);

        database.editRecord("delete", "record 1");
    }
}