public class AceToAcmeAdapter implements AcmeInterface
{
    private AceClass ace;
    private String firstName;
    private String lastName;

    public AceToAcmeAdapter(AceClass a) {
        ace = a;
        firstName = ace.getName().split(" ")[0];
        lastName = ace.getName().split(" ")[1];
    }

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