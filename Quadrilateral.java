//creating a class Quadrilateral which extends abstract class Shape
public class Quadrilateral extends Shape{
    @Override
    public void calculateArea(){
        System.out.println("Area of quadrilateral");
    }
    
    @Override
    public void calculatePerimeter(){
        System.out.println("Perimeter of quadrilateral");
    }
}