public class ProxyPattern
{
    public static void main(String[] args) {
        AutomatProxy proxy = new AutomatProxy();

        proxy.gotApplication();
        proxy.checkApplication();
        proxy.rentApartment();
    }
}