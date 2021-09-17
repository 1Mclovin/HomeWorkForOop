package Shapes.Shapestester;

import Animal.Animals;
import Animal.DangerousAnimal;
import Calc.Calculator;
import Employee.Pay;
import Shapes.Square;
import Shapes.Triangle;
import Shapes.TrianglePerimeter;

public class Main {
    public static void main(String[] args) {

// calculate area of triangle
        Triangle triangle1 = new Triangle(10,18);
        System.out.println(triangle1.calcAreaOfTriangle());

// calculate triangle perimeter
        TrianglePerimeter triangle2 = new TrianglePerimeter(2,12,9);
        System.out.println(triangle2.calculatePerimeterOfTriangle());

// calculate square area
        Square square1 = new Square(8);
        System.out.println(square1.squareArea());

//calculate square perimeter

        Square square2= new Square(3);
        System.out.println(square2.squarePerimeter());

// calculate animal body parts
        Animals Chicken =new Animals(2,1,2,1);
        System.out.println(Chicken.AnimalBodyPartTotal());

// See if animal is dangerous or not
        DangerousAnimal Shark =new DangerousAnimal("no","Yes definitely","no","no","yes");
        System.out.println(Shark.getKilledByAnimal(Shark.venomous, Shark.eatsPeople));

// Calculator
        Calculator CalculateNumbers=new Calculator(8.65,3);

        System.out.println(CalculateNumbers.add());

        System.out.println(CalculateNumbers.subtract());

        System.out.println(CalculateNumbers.divide());

        System.out.println(CalculateNumbers.multiply());

        System.out.println(CalculateNumbers.calculateExponents());

//Calculate each employees Pay

        Pay EmployeeRaul=new Pay(55,44.50);
        Pay EmployeeCrackHeadBilly= new Pay(15,100);

        System.out.println(EmployeeRaul.netPay());

        System.out.println(EmployeeCrackHeadBilly.netPay());



    }

}
