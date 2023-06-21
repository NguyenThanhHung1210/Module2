package accessmodifier_staticmethod_staticproperty.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return Math.pow(this.radius,2) * Math.PI;
    }


}
