public class DecoratorPattern
{
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer = new CD(computer);
        computer = new Monitor(computer);
        computer = new Disk(computer);

        System.out.println("You are getting a " + computer.description());
    }
}