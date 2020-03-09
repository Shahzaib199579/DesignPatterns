public class AceClass implements AceInterface
{
    private String name;
    public AceClass() {

    }

    @Override
    public void setName(String n) {
        name = n;
    }

    @Override
    public String getName() {
        return name;
    }
    
}