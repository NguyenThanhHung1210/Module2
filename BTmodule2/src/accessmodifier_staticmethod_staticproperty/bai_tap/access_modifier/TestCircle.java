package accessmodifier_staticmethod_staticproperty.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        System.out.println("Radius is: "+ circle.getRadius());
        System.out.println("Area is: "+ circle.getArea());
        System.out.println("color is: " + circle.getColor());
    }
}
