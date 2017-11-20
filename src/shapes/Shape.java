
package shapes;

public abstract class Shape {
    private String name;
    
    public Shape(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
     public abstract double area();
     public abstract double circumference();

    @Override
    public String toString() {
        return name + ": ";
    }
   
    
}
