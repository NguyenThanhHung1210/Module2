package class_and_object_ịn_java.bai_tap;

public class BuildQuadraticEquation {
        private double a , b ,c ;
        public BuildQuadraticEquation(){
        }
        BuildQuadraticEquation(double a, double b, double c ){
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }
        public void getDiscriminant(){
            double delta;
            delta = (b*2) - (4*a*c);
        }
        public void getRoot1(){
            double r1;
            r1 = (-b+Math.sqrt((b*b)-(4*a*c)));
        }
        public void getRoot2(){
            double r2;
            r2 = (-b-(Math.sqrt((b*b)-(4*a*c))));
        }

}
