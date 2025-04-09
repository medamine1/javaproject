package gestion.emploi;

public class Cours {
    private String nom;
    private Enseignant enseignant;

    public Cours(String nom, Enseignant enseignant) {
        this.nom = nom;
        this.enseignant = enseignant;
    }

    public String getNom() {
        return nom;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }
}
