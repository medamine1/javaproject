package gestion.emploi;
public class Utilisateur {
    protected int id;
    protected String nom;
    protected String email;
    protected String typeUtilisateur;


    public void seConnecter() {
    System.out.println("connexion reussie pour: " + nom);
    }
    public void consulterEmploi(){
        System.out.println("Consultation de l'emploi");
    }
<<<<<<< HEAD

}
=======
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public String getTypeUtilisateur() {
        return typeUtilisateur;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTypeUtilisateur(String typeUtilisateur) {
        this.typeUtilisateur = typeUtilisateur;
    }

}
>>>>>>> 5bc938f7c4d3fed7c619bcb866b242ee85eba12b
