package ExerciciCombat;

import java.util.Random;

public class Jugador {
    String nom;
    int nivell;
    int punts;
    int puntsVida;
    int puntsVidaMax;
    int puntsAtac;
    int puntsDefensa;

    //Constructors
    public Jugador(String nom, int puntsAtac, int puntsDefensa, int punts, int puntsVida, int puntsVidaMax, int nivell) {
        this.nom = nom;
        this.puntsAtac = puntsAtac;
        this.puntsDefensa = puntsDefensa;
        this.punts = punts;
        this.puntsVida = puntsVida;
        this.puntsVidaMax = puntsVidaMax;
        this.nivell = nivell;
    }


    void restarVida(int punts) {
        this.puntsVida -= punts;
        if (this.puntsVida < 0) {
            puntsVida = 0;
        }
    }

    void recuperaVida(int punts, int puntsVidaMax, int puntsVida) {
        this.puntsVida += punts;
        if (this.puntsVida => this.puntsVidaMax){
            puntsVida = puntsVidaMax;
        }
    }

    void MostrarEstadistiques() {
        System.out.printf("Nom: %s, Atac: %d, Defensa, Exp: %d, Vida: %d, VidaMax: %d, Nivell: %d");
    }

    void Penalitzacio() {
        if (Math.random() == 0) {
            this.puntsAtac -= punts;

        } else {
            this.puntsDefensa -= punts;

        }
    }


}