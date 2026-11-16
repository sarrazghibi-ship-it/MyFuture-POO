import java.util.Scanner;
public class Produit {
    String reference;
    String designation;
    double prixHT;
    int qte;
    public Produit (String ref , String des , double p, int q) {
        this.reference = ref;
        this.designation = des;
        this.prixHT = p;
        this.qte = q;
    }
        public String getreference(){
            return reference;
        }
        public String getdesignation(){
            return designation;
        }
        public double getprixHT(){
            return prixHT;
        }
        public int getqte(){
            return qte;
        }
        public void setreference(String r){
            this.reference = r;
        }
        public void setdesignation(String d){
            this.designation = d;
        }
        public void setprixHT(double p){
            this.prixHT = p;
        }
        public void setqte(int q){
            this.qte = q;
        }
        public void saisir(){
            Scanner sc = new Scanner(System.in);
             System.out.print("Saisir la reference : ");
            this.reference = sc.nextLine();
            System.out.print("Saisir la designation : ");
            this.designation = sc.nextLine();
            System.out.print("Saisir le prix : ");
            this.prixHT = sc.nextDouble();
            System.out.print("Saisir la quantité : ");
            this.qte = sc.nextInt();
            sc.nextLine();
        }
        public void affichier(){
            System.out.println ("la reference est:"+reference);
            System.out.println ("la designation est:"+designation);
            System.out.println ("le prix est:"+prixHT);
            System.out.println ("la quantite est:"+qte);
        }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produit p = new Produit( "ref1", "ordinateir", 600.000,10);
        p.affichier();
        Produit p1= new Produit("ref2", "souris", 15.000, 5);
        System.out.println (p1.getreference());
        p1.setqte(10);
        System.out.println (p1.getqte());
    
         int choix;
         
        do {
            System.out.println("1 - Afficher détails produit");
            System.out.println("2 - Ajouter produit");
            System.out.println("3 - Modifier produit");
            System.out.println("4- Quitter");
            System.out.println("Donner votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                p.affichier();
                break;
                case 2:
                p.saisir();
                break;
                case 3 :
                p.setdesignation("clavier");
                p.affichier();
                break;
                case 4:
                    System.out.println("au revoir");
                    break;
                default:
                    System.out.println("Choix invalide, réessayez.");
                    break;
            }
         } while (choix != 4); 
            sc.close();
}
}



    

