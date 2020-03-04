public class Polymorphism
{
    public static void main(String[] args) {
        Shape shape = new Shape();
        
        // using shape variable to draw rectangle
        shape = new Rectangle();
        shape.draw();
    }
}