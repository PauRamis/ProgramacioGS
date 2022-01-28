package ExercicisClasses;

public class Carta {
    enum Pal {
        OROS, BASTOS, ESPASES, COPES
    }

    enum Nums {
        AS, DOS, TRES, QUATRE, CINC, SIS, SET, VUIT, NOU, SOTA, CAVALL, REI
    }

    Pal pal;
    Nums num;

    Carta(Pal pal, Nums num) {
        this.pal = pal;
        this.num = num;
    }

    String imprimeix() {
        return (this.num.toString() + " de " + this.pal.toString());
    }

}
