
public class Etudiant { 
    
       String nom;
       int age;

       public Etudiant(String n , int a) {
        nom=n;
        age=a;
       }
       public void affichier() {
        System.out.println( "le nom est: " + nom + " et l'âge est: " + age );
       }
       public static void main(String[] args) {
       Etudiant e1 = new Etudiant("Ali", 20);
       e1.affichier();
       }


    
    

}
