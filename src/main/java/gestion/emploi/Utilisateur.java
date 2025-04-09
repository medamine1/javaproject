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

}