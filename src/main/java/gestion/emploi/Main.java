package gestion.emploi;

public class Main {
    public static void main(String[] args){
        Groupe g = new Groupe(1, "3INFO-A");
        Etudiant e = new Etudiant(1, "Sami", "sami@mail.com", g);
    }
}
