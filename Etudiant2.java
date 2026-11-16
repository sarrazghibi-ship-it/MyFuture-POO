import java.util.Scanner;

public class Etudiant2 {
  String codeE;
  String nom;
  String prenom;
  int age;
  String ville;
  // Constructeur
  public Etudiant2(String code, String nom, String prenom, int age, String ville) {
    this.codeE = code;
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
    this.ville = ville;
  }
  // getters et setters du nom et prenom
  public String getNom() {
    return nom;
  }
  public String getPrenom() {
    return prenom;
  }
  public void setNom(String nom) {
    this.nom = nom;
  }
  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }
  // methode pour saisir les informations d'un étudiant en utilisant Scanner
  public void saisirEtudiant() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez le code de l'étudiant : ");
    this.codeE = scanner.nextLine();
    System.out.print("Entrez le nom de l'étudiant : ");
    this.nom = scanner.nextLine();
    System.out.print("Entrez le prénom de l'étudiant : ");
    this.prenom = scanner.nextLine();
    System.out.print("Entrez l'âge de l'étudiant : ");
    this.age = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Entrez la ville de l'étudiant : ");
    this.ville = scanner.nextLine();
     }
    // methode pour afficher les informations d'un étudiant
    public void afficherEtudiant() {
         System.out.println("Code de l'étudiant : " + this.codeE);
         System.out.println("Nom de l'étudiant : " + this.nom);
         System.out.println("Prénom de l'étudiant : " + this.prenom);
         System.out.println("Âge de l'étudiant : " + this.age);
         System.out.println("Ville de l'étudiant : " + this.ville);
        }   
    // tableau de 3 etudiants 
  public static double[] creerTableautab() {
     Scanner scanner = new Scanner(System.in);
     double[] tab = new double[3];
     for (int i=0;i<tab.length;i++){
        System.out.println("entrer la note :"+(i+1));
        tab[i]=scanner.nextDouble();

     }
     return tab;
 }
 // methode de calculer le max des moyennes
    public static double afficherPlusGrandetab(double[] tab) {
        double max = tab[0];
        for(int i =0;i<tab.length;i++){
            if(tab[i]>max){
                max = tab[i];
            }
        }
        return max;
    }
 //main pour tester 
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     Etudiant2 E1 = new Etudiant2("", "", "", 0, "");
     E1.saisirEtudiant();
     E1.afficherEtudiant();
     double[] tab = creerTableautab();
     double max = afficherPlusGrandetab(tab);
     System.out.println("La plus grande note est : " + max);
      //test getter et setter
    System.out.println("Nom avant modification : " + E1.getNom());
    E1.setNom("Zghibi");
    System.out.println("Nom après modification : " + E1.getNom());
    System.out.println("Prénom avant modification : " + E1.getPrenom());
    E1.setPrenom("Sarra");
    System.out.println("Prénom après modification : " + E1.getPrenom());
    int choix;
    do{
         System.out.println("1 - Saisir un etudient et afficher ses informations");
         System.out.println("2 - Afficher les notes");
         System.out.println("3- Quitter");
         System.out.println("Donner votre choix : ");
         choix = sc.nextInt();

        switch (choix) {
            case 1:
                E1.saisirEtudiant();
                E1.afficherEtudiant();
                break;
            case 2:
                 tab = creerTableautab();
                break;
            case 3:
                System.out.println("Au revoir !" );
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
                break;
            }
    } while (choix != 3);

    sc.close();
 }
}
