public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5.0);
        System.out.println(circle);

        circle = new Circle(5.0,"yellow",true);
        System.out.println(circle);
    }
}
