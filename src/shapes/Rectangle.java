
package shapes;


public class Rectangle extends Shape{

    private double width;
    private double hieght;
    
    public Rectangle(String name ,double width,double hieght){
        super(name);
        this.hieght = hieght;
        this.width = width;
        
    }
    
    @Override
    public double area() {
        return 2*(width+hieght);
    }

    @Override
    public double circumference() {
       return width*hieght;
    }

    @Override
    public String toString() {
        return "Rectangle: " + super.toString() + width + " " + hieght;
    }
    
}
