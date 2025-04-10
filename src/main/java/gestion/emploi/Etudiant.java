package gestion.emploi;

public class Etudiant extends Utilisateur{
    private Groupe groupe;
    public Etudiant(int id, String nom,String email,Groupe groupe){
        this.id=id;
        this.nom=nom;
        this.email=email;
        this.typeUtilisateur="etudiant";
        this.groupe=groupe;
    }
<<<<<<< HEAD
=======
    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }
>>>>>>> 5bc938f7c4d3fed7c619bcb866b242ee85eba12b
}
