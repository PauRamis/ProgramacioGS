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
        System.out.printf("Nom: %s, Atac: %d, Defensa: %d, Vida: %d\n", this.nom, this.puntsAtac, this.puntsDefensa, this.puntsVida);
    }

    void Penalitzacio(int punts) {

        //Math.random decidira si restar atac o defensa.
        if (Math.random() < 0.5) {
            this.puntsAtac -= punts;

        } else {
            this.puntsDefensa -= punts;

        }
    }

    //TiraMonedes simula tirar una moneda a cara creu tantes vegades com habilitat tengui el jugador, per estabir els punts en una acció. (exit)
    int TiraMonedes(int repeticions){
        int contador = 0;
        for (int i = 0; i < repeticions; i++) {
            if (Math.random() < 0.5) {
            contador++;
            }
        } return contador;
    }

}