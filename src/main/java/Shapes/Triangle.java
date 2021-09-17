package Shapes;

public class Triangle {
// what do we need to calculate the area of a triangle

    //for area you need
    public double base;
    public double height;

    // now we need a constructor

    public Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }

public double calcAreaOfTriangle(){
        return this.base*this.height /2;
}

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

}
