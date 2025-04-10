package gestion.emploi;

public class Groupe {
<<<<<<< HEAD
=======
   private String nom;
    private int niveau; 

    public Groupe(String nom, int niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getNiveau() {
        return niveau;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "Groupe{" +
                "nom='" + nom + '\'' +
                ", niveau=" + niveau +
                '}';
    }
>>>>>>> 5bc938f7c4d3fed7c619bcb866b242ee85eba12b
}
