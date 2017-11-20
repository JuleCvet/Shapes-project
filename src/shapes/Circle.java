
package shapes;

public class Circle extends Shape{
    private double radie;

    public Circle(String name,double radie) {
        super(name);
        this.radie = radie;
    }
    
    @Override
    public double area() {
      return  Math.PI * Math.pow(radie, 2);
    }

    @Override
    public double circumference() {
        return 2*Math.PI*radie;
    }

    @Override
    public String toString() {
        return "Circle : "+super.toString()+radie;
    }
    
}
