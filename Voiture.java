import java.util.Scanner;

public class Voiture {
   public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

String marque;
int vitesse;
String couleur;
int choix;

System.out.println(" saisir la couleur :");
couleur = scanner.nextLine();

System.out.println(" saisir la marque :");
marque = scanner.nextLine();

System.out.println(" saisir la vitesse :");
vitesse = scanner.nextInt();

do {
System.out.println("1. Afficher détails");
System.out.println("2. get couleur voiture");
System.out.println("3. Quitter");
choix = scanner.nextInt();

switch (choix) {
case 1:
System.out.println("Vitesse : " + vitesse);
System.out.println("Marque : " + marque);
break;
case 2:
System.out.println("Couleur : " + couleur);
break;
case 3:
System.out.println("A la prochaine !");
break;
default:
System.out.println("Choix invalide");
}
} while (choix != 3);

scanner.close();
}
}