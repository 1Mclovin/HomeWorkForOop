package Calc;

public class Calculator {


    public double x;
    public double y;


    public  Calculator(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double add(){
        return this.x + this.y;
    }

    public double subtract(){
        return this.x - this.y;
    }

    public double divide(){
        return this.x / this.y;
    }

    public double multiply(){
        return this.x * this.y;
    }

    public double calculateExponents(){
        return Math.pow(this.x,this.y);
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }



}
