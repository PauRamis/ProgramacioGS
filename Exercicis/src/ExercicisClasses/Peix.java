package ExercicisClasses;

public class Peix {
    String nom;
    static int count;

    Peix(String nom){
        count++;
        this.nom = nom;
    }

    Peix(Peix p){
        count++;
        this.nom = p.nom;
    }


    boolean equals(Peix p){
        return this.nom.equals(p.nom);
    }

    public String getNom(){
        return nom;
    }

}
