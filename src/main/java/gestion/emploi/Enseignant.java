package gestion.emploi;

public class Enseignant extends Utilisateur {
    private String specialite;

    public Enseignant(int id, String nom, String email, String specialite) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.typeUtilisateur = "enseignant";
        this.specialite = specialite;
    }

    // Getter et Setter pour specialite
    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
