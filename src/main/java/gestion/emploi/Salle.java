package gestion.emploi;

public class Salle {
    private String nom;
    private int capacite;
    private String type; // Exemple : "cours", "TP", "amphi", etc.

    public Salle(String nom, int capacite, String type) {
        this.nom = nom;
        this.capacite = capacite;
        this.type = type;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setType(String type) {
        this.type = type;
    }
}
