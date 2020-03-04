public abstract class Vehicle
{
    private GoAlgorithm goAlgorithm;
    public Vehicle()
    {

    }

    public void setGoAlgorithm(GoAlgorithm algorithm)
    {
        this.goAlgorithm = algorithm;
    }

    public void go()
    {
        goAlgorithm.go();
    }
}