package gestion.emploi;

public class Administrateur extends Utilisateur {
    public Administrateur(int id, String nom , String email){
          this.id= id;
          this.nom= nom;
          this.email= email;
          this.typeUtilisateur= "administration";
    }
    public void gererEmploiDuTemps() {
        System.out.println(nom + " gère l'emploi du temps.");
    }
}
