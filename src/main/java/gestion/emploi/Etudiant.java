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
}
