import java.util.*;

public class Database implements Subject
{
    private Vector<Observer> observers;
    private String operation;
    private String record;

    public Database() {

        observers = new Vector<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.operation, this.record);
        }

    }

    public void editRecord(String o, String r)
    {
        this.operation = o;
        this.record = r;
        this.notifyObservers();
    }
}