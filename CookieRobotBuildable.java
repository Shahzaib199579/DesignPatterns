import java.util.ArrayList;
import java.util.Iterator;

public class CookieRobotBuildable implements RobotBuildable {
    ArrayList<Integer> actions;

    public CookieRobotBuildable() {

    }

    public void loadActions(ArrayList a) {
        actions = a;
    }

    public void start() {
        System.out.println("Starting....");
    }

    public void getParts() {
        System.out.println("Getting flour and sugar....");
    }

    public void assemble() {
        System.out.println("Baking a cookie....");
    }

    public void test() {
        System.out.println("Crunching a cookie....");
    }

    public void stop() {
        System.out.println("Stopping....");
    }

    public final void go() {

        Iterator itr = actions.iterator();

        while (itr.hasNext()) {
            switch ((Integer) itr.next()) {
                case 1:
                    start();
                    break;
                case 2:
                    getParts();;
                    break;
                case 3:
                    assemble();;
                    break;
                case 4:
                    test();;
                    break;
                case 5:
                    stop();;
                    break;
            }
        }

    }

}