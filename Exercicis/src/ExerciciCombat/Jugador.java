package ExerciciCombat;

public class Jugador {
    String nom;
    int nivell;
    int punts;
    int puntsVida;
    int puntsVidaMax;
    int puntsAtac;
    int puntsDefensa;

    //Constructors
    public Jugador(String nom, int puntsAtac, int puntsDefensa) {
        this.nom = nom;
        this.puntsAtac = puntsAtac;
        this.puntsDefensa = puntsDefensa;
        this.puntsVida = 10;
        this.puntsVidaMax = 10;
        this.nivell = 0;
    }


    void restarVida(int punts) {
        this.puntsVida -= punts;
        if (this.puntsVida < 0) {
            this.puntsVida = 0;
        }
    }

    void recuperaVida(int punts) {
        this.puntsVida += punts;
        if (this.puntsVida > this.puntsVidaMax){
            this.puntsVida = this.puntsVidaMax;
        }
    }

    void MostrarEstadistiques() {
        System.out.printf("Nom: %s, Atac: %d, Defensa, Vida: %d\n", nom, puntsAtac, puntsDefensa, puntsVida);
    }

    void Penalitzacio() {

        //Math.random decidira si restar atac o defensa.
        if (Math.random() == 0) {
            this.puntsAtac -= punts;

        } else {
            this.puntsDefensa -= punts;

        }
    }


}