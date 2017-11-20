
package shapes;

import java.util.ArrayList;
import java.util.Scanner;
import static shapes.Utilities.*;

 public class Main {

    static ArrayList<Shape> listOfShapes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int i = 0;

    public static void main(String[] args) {

        boolean loop = true;
        while (loop) {
            switchMenu(Ui.menu());//izborot od menu gi povrzuvame so metodite
        
          System.out.println("Do you want to pick the shape again? Yes/No");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("yes")) {

                } else {
                    loop = false;
            }          
        }  
    }

    private static int switchMenu(int menu) {
        double area;
        double circumference;
        switch (menu) {
            case 1:
                Shape s = null;
                int num = nextInt("1: Circle \n2: Rectangel");
                if (num == 1) {
                    s = new Circle(nextLine("Choose name for the circle: "), nextDouble("1and radie: "));
                    System.out.println("Do you want to calculate area, circumference or both?");
                    String selection = sc.nextLine();
                    
                        if (selection.equalsIgnoreCase("Area")) {
                            area = s.area();
                            System.out.println("Area of circle is : " + area);
                    
                   } else if (selection.equalsIgnoreCase("Circumference")) {
                        circumference = s.circumference();
                        System.out.println("Circumference of circle is : " + circumference);
                   
                    } else if (selection.equalsIgnoreCase("Both")) {
                        circumference = s.circumference();
                    System.out.println("Circumference of circle is : " + circumference);
                        area = s.area();
                    System.out.println("Area of circle is : " + area);
                }
                break;
                } else {
                    if (num == 2) {
                    s = new Rectangle(nextLine("Choose name for the Rectangle:"), nextDouble(" width: "), nextDouble(" and hiegth"));
                    System.out.println("Do you want to calculate area, circumference or both?");
                    String selection = sc.nextLine();
                    
                        if (selection.equalsIgnoreCase("Area")) {
                            area = s.area();
                    System.out.println("Area of Rectangle is : " + area);
                    
                   } else if (selection.equalsIgnoreCase("Circumference")) {
                        circumference = s.circumference();
                   System.out.println("Circumference of Rectangle is : " + circumference);
                   
                    } else if (selection.equalsIgnoreCase("Both")) {
                        circumference = s.circumference();
                    System.out.println("Circumference of Rectangle is : " + circumference);
                        area = s.area();
                    System.out.println("Area of Rectangle is : " + area);
                }
                    }
                }
                  
                listOfShapes.add(s);//ja dodava izbranata forma
               break;
            case 2:
                Shape temp = null;
                String name = nextLine("Vilken name you want to delete: ");
                for (Shape shape : listOfShapes) {
                    if (shape.getName().equalsIgnoreCase(name)) {
                        temp = shape;
                    }
                }
                listOfShapes.remove(temp);
                break;
                
            case 3:
                System.out.println(listOfShapes);
                break;

            default:
                System.out.println("Du har inte vald från menyn, försök igen.");
        }
        return menu;
    }
 }