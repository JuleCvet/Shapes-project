
package shapes;

import java.util.ArrayList;
import java.util.Scanner;


public class Ui {
     public static int menu(){
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("1. Create a new Shape: ");
         System.out.println("2. Delete from list ");
         System.out.println("3. Visa alla");
         System.out.println("4. Vill du rekna area");
       
         
         System.out.println("Vad ska du välja från menyn?");
         int ansvar = sc.nextInt();
         sc.nextLine();
         return ansvar;
    }
     
    
}
