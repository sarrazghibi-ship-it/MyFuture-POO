 import java.util.Scanner;
 public class Switch2 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int choix;
        do { 
            System.out.println( "1.bonjour:");
             System.out.println( "2.affichier un message de bienvenue:");
              System.out.println( "3.quitter:");
               choix = s.nextInt();
              switch (choix){
                case 1 :
                     System.out.println( "bonjour");
                     break;
                     case 2 :
                        System.out.println( "bienvenue");
                        break;  
                        case 3 :
                             System.out.println( "byeee");
                             default:
                                 System.out.println( "erreur");
              }
               } while (choix != 3);
                s.close();
        }
                            
              }   
                

        
    

 
