
public class CompteBancaire {

    private String numeroCompte;
    private double solde;
    private Client titulaire;

    private static int nombreComptes = 0;

    
    public CompteBancaire(String numeroCompte, double soldeInitial, Client titulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = soldeInitial;
        this.titulaire = titulaire;
        nombreComptes++;
    }

    
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public Client getTitulaire() {
        return titulaire;
    }

    
    public void setTitulaire(Client titulaire) {
        this.titulaire = titulaire;
    }

    
    public static int getNombreComptes() {
        return nombreComptes;
    }

    
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt effectué : " + montant + " TND");
        } else {
            System.out.println("Montant invalide !");
        }
    }

    
    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait effectué : " + montant + " TND");
        } else {
            System.out.println("Solde insuffisant !");
        }
    }

    public void virement(CompteBancaire destinataire, double montant) {
        if (destinataire != null && montant > 0 && montant <= solde) {
            this.solde -= montant;
            destinataire.deposer(montant);
            System.out.println("Virement effectué : " + montant + " TND");
        } else {
            System.out.println("Virement impossible !");
        }
    }

    
    public void afficherDetails() {
        System.out.println("Numéro du compte : " + numeroCompte);
        System.out.println("Titulaire : " + titulaire.getNom() + " "
                + titulaire.getPrenom());
        System.out.println("CIN : " + titulaire.getCin());
        System.out.println("Téléphone : " + titulaire.getTelephone());
        System.out.println("Solde : " + solde + " TND");
        System.out.println("----------------------------");
    }
}
