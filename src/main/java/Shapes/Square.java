package Shapes;

public class Square {
    public int sideA;


    public Square(int sideA){
        this.sideA=sideA;
    }

    public int squareArea(){
        return this.sideA*this.sideA;
    }

    public int squarePerimeter(){
        return this.sideA*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                '}';
    }
}
