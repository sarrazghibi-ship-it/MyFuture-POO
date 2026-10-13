import java.util.Scanner;
public class PlusGrand {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.print("APPLICATION 2 : Plus grand de deux nombres");
        System.out.print("Saisissez le premier nombre : ");
        double num1App2 = s.nextDouble();
         System.out.print("Saisissez le second nombre : ");
        double num2App2 = s.nextDouble();
        if (num1App2 > num2App2) {
            System.out.println("Le plus grand nombre est : " + num1App2);
        } else if (num1App2 < num2App2) {
            System.out.println("Le plus grand nombre est : " + num2App2);
        } else {
            System.out.println("Les deux nombres sont égaux.");
        }
    }
    
}
