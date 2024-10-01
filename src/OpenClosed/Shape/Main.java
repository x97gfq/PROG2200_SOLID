package OpenClosed.Shape;

public class Main {
    public static void main(String[] args) {

        Circle circ = new Circle(55);
        System.out.println(circ.area());

        Rectangle rect = new Rectangle(5, 6);
        System.out.println(rect.area());
    }
}