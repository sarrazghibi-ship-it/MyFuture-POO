
public class Client {

    private String cin;
    private String nom;
    private String prenom;
    private String telephone;

    
    public Client(String c, String n, String p, String t) {
        cin = c;
        nom = n;
        prenom = p;
        telephone = t;
    }

    
    public String getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }


    public void setCin(String c) {
        cin = c;
    }

    public void setNom(String n) {
        nom = n;
    }

    public void setPrenom(String p) {
        prenom = p;
    }

    public void setTelephone(String t) {
        telephone = t;
    }


    public void affichierClient5() {
        System.out.println(
            "[CIN: " + cin + "] Nom & Prénom: " + nom + " " + prenom
            + " | Tél: " + telephone + "."
        );
    }
}

