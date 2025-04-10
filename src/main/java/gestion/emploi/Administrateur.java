package gestion.emploi;

<<<<<<< HEAD
public class Administrateur {
=======
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
>>>>>>> 5bc938f7c4d3fed7c619bcb866b242ee85eba12b
}
