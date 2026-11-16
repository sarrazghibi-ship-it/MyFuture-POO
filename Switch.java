import java.util.Scanner;
public class Switch {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println( "entrer nombre1:");
        int nombre1=s.nextInt();
        System.out.println( "entrer nombre2:");
        int nombre2=s.nextInt();
        System.out.println( "entrer l'operateur:");
        String operateur=s.next();
             switch (operateur) {
                 case "+":
                     System.out.println("la somme est: " + (nombre1 + nombre2));
                    break;
                    case "-":
                    System.out.println("la soustraction est: " + (nombre1 - nombre2));
                    break;
                    case "*":
                    System.out.println("la multiplication est: " + (nombre1 * nombre2));
                    break;
                    case "/": 
                    if (nombre2!=0){ 
                        System.out.println("la division est: " + (nombre1 / nombre2));
                    } else {
                        System.out.println("erreur: division par zéro");
                    }
                    break;
                    default:
                    System.out.println("erreur: operateur invalide");
        

            }
        }

}