import java.util.ArrayList;

public class CookieRobotBuilder implements RobotBuilder
{
    CookieRobotBuildable robot;
    ArrayList<Integer> actions;
    
    public CookieRobotBuilder() {
        robot = new CookieRobotBuildable();
        actions = new ArrayList<Integer>();
    }

    @Override
    public void addStart() {
        actions.add(1);

    }

    @Override
    public void addGetParts() {
        // TODO Auto-generated method stub

    }

    @Override
    public void addAssemble() {
        // TODO Auto-generated method stub

    }

    @Override
    public void addTest() {
        // TODO Auto-generated method stub

    }

    @Override
    public void addStop() {
        actions.add(5);

    }

    @Override
    public RobotBuildable getRobot() {
        robot.loadActions(actions);

        return robot;
    }
}