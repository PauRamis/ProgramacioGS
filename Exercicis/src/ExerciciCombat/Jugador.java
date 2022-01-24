package ExerciciCombat;

public class Jugador {
    String nom;
    int nivell;
    int puntsExp;
    int puntsVida;
    int puntsVidaMax;
    int puntsAtac;
    int puntsDefensa;
    int duradaPenal;
    int penalAtac;
    int penalDefensa;

    //Constructors
    public Jugador(String nom) {
        this.nom = nom;
        this.puntsAtac = 10;
        this.puntsDefensa = 10;
        this.puntsVida = 20;
        this.puntsVidaMax = 20;
        this.puntsExp = 0;
        this.nivell = 0;
        this.duradaPenal = 0;
        this.penalAtac = 0;
        this.penalDefensa = 0;
    }


    void restarVida(int punts) {
        this.puntsVida -= punts;
        if (this.puntsVida < 0) {
            this.puntsVida = 0;
        }
    }

    void recuperaVida(int punts) {
        this.puntsVida += punts;
        if (this.puntsVida > this.puntsVidaMax) {
            this.puntsVida = this.puntsVidaMax;
        }
    }

    void MostrarEstadistiques() {
        System.out.printf("%s: Atac: %d, Defensa: %d, Vida: %d\n", this.nom, this.puntsAtac, this.puntsDefensa, this.puntsVida);
    }

    void penalitzacio(int punts) {
        //Nomes una penalitzacio a la vegada
        if (this.duradaPenal == 0) {
            //Mai pot ser menys de 1
            if (punts == 0) punts = 1;

            //Dura només 5 turns.
            this.duradaPenal = 5;

            //Math.random decidira si restar atac o defensa. Es guardaran el penal per fer el segiment
            if (Math.random() < 0.5) {
                this.puntsAtac -= punts;
                this.penalAtac = punts;
            } else {
                this.puntsDefensa -= punts;
                this.penalDefensa = punts;
            }
        } else System.out.println("Nomes una penalitzacio a la vegada");
    }

    //TiraMonedes simula tirar una moneda a cara creu tantes vegades com habilitat tengui el jugador, per estabir els punts en una acció. (exit)
    int TiraMonedes(int repeticions) {
        int contador = 0;
        for (int i = 0; i < repeticions; i++) {
            if (Math.random() < 0.5) {
                contador++;
            }
        }
        return contador;
    }


    void ClaseElegida(int numeroDeClase) {
        if (numeroDeClase == 1) {
            this.puntsAtac = 10;
            this.puntsDefensa = 40;
        }
        if (numeroDeClase == 2) {
            this.puntsAtac = 15;
            this.puntsDefensa = 35;
        }
        if (numeroDeClase == 3) {
            this.puntsAtac = 20;
            this.puntsDefensa = 30;
        }
        if (numeroDeClase == 4) {
            this.puntsAtac = 25;
            this.puntsDefensa = 25;
        }
        if (numeroDeClase == 5) {
            this.puntsAtac = 30;
            this.puntsDefensa = 20;
        }
    }
}