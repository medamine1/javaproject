package gestion.emploi;

<<<<<<< HEAD
public class Enseignant {
    
=======
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
    public String getSpecialite() {git
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
>>>>>>> 5bc938f7c4d3fed7c619bcb866b242ee85eba12b
}
