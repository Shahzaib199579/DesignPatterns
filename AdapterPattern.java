public class AdapterPattern
{
    public static void main(String[] args) {
        
        AceClass ace = new AceClass();
        ace.setName("Shahzaib Khan");

        AceToAcmeAdapter adapter = new AceToAcmeAdapter(ace);

        System.out.println("First Name:" + adapter.getFirstName());
        System.out.println("Last Name:" + adapter.getLastName());
    }
}