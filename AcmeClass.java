public class AcmeClass implements AcmeInterface
{
    private String firstName;
    private String lastName;

    @Override
    public void setFirstName(String f) {
        firstName = f;
    }

    @Override
    public void setLastName(String l) {
        lastName = l;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
    
}