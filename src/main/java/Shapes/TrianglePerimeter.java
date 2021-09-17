package Shapes;

public class TrianglePerimeter {
    public int sideA;
    public int sideB;
    public int sideC;

    // constructor
    public TrianglePerimeter(int sideA,int sideB,int sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

    public int calculatePerimeterOfTriangle(){
        return this.sideA+ this.sideB+ this.sideC;
    }

    @Override
    public String toString() {
        return "TrianglePerimeter{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
