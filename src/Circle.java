public class Circle extends Shape {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }



    public void setRadius(int radius) {
        if (radius < 0){
            throw new IllegalArgumentException("Radius can't be negative");
//            this.radius = 0;
//            System.out.println("Radius can't be negative");
        }else {
            this.radius = radius;

        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + this.radius +
                '}';
    }

    public double area (){
        return Math.PI**;
    }

    @Override
    public double perimeter() {
        return 2*Math
    }
}
