public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(3.0);
        System.out.println(square);

        square = new Square(3.0,"black",true);
        System.out.println(square);
        System.out.println(square.getSide());
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square.getColor());
        square.setSide(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
