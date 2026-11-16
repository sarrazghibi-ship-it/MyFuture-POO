
import java.util.Scanner;

public class Enseignant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codeE;
        String libelleM;
        int nbEtudiants;
        int choix;

        System.out.print("Saisir code enseignant : ");
        codeE = sc.nextInt();
        sc.nextLine();

        System.out.print("Saisir libellé matière : ");
        libelleM = sc.nextLine();

        System.out.print("Saisir nombre d'étudiants : ");
        nbEtudiants = sc.nextInt();

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Afficher détails enseignant");
            System.out.println("2 - Quitter");
            System.out.print("Votre choix : ");

            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Code enseignant : " + codeE);
                    System.out.println("Libellé matière : " + libelleM);
                    System.out.println("Nombre d'étudiants : " + nbEtudiants);
                    break;

                case 2:
                    System.out.println("Merci pour votre visite !");
                    break;

                default:
                    System.out.println("Choix invalide, réessayez.");
                    break;
            }

        } while (choix != 2);

        sc.close();
    }
}

