
package shapes;


import java.util.Scanner;


public class Utilities {
    
    static Scanner sc = new Scanner(System.in);
    
    public static double nextDouble(String s){
        System.out.println(s);
        double num ;
        try{
            num = sc.nextDouble();
            sc.nextLine();
        }catch(Exception e){
            sc.nextLine();
            num = nextDouble("Please write a double number:");
        }
        return num;
    }
    
        public static int nextInt(String s){
        System.out.println(s);
        int num ;
        try{
            num = sc.nextInt();
            sc.nextLine();
        }catch(Exception e){
            sc.nextLine();
            num = nextInt("Please write a double number:");
        }
        return num;
    }
       public static String nextLine(String s){ 
           System.out.println(s);
           return sc.nextLine();
       }
}
