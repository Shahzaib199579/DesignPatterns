public class StatePattern
{
    public static void main(String[] args) {
        // RentalMethods rentalMethods = new RentalMethods(9);

        // rentalMethods.checkApplication();
        // rentalMethods.GetApplication();
        // rentalMethods.checkApplication();

        // created classes for each state for cleaner code
        // now testing them

        Automat automat = new Automat(9);

        automat.gotApplication();
        automat.checkApplication();
        automat.rentApartment();
    }
}