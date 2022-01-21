package ExerciciCombat;
import java.util.Scanner;

//Aquest es un joc tipus pedra, paper, estisores, però més complexe i amb tematica de RPG.
public class Main {
    public static void main(String[] args) {

        //Primer cream dos jugadors, Jugador1 i Jugador2.



        Jugador Jugador1 = new Jugador("Pau", 10, 5);
        Jugador Jugador2 = new Jugador("Adversari", 5, 15);

        ronda(Jugador1, Jugador2);

    }
    static void ronda(Jugador Jugador1, Jugador Jugador2){
        int estr1 = accioJugador();
        int estr2 = accioAdversari();
        //Proves
        estr2 = 2;
        System.out.println("L'adversari ha triat: ");
        System.out.println(estr2);

    //Jugador accio 1

        if (estr1 == 1 && estr2 == 2){
            Jugador2.recuperaVida(Jugador2.TiraMonedes(Jugador2.puntsDefensa));
            System.out.println("Jugador2 recupera vida");
        }

        if (estr1 == 1 && estr2 == 3){
            Jugador1.restarVida(Jugador2.TiraMonedes(Jugador2.puntsAtac));
            System.out.println("Jugador1 danya a Jugador2");
        }

        if (estr1 == 1 && estr2 == 4){
            Jugador1.restarVida(Jugador2.TiraMonedes(Jugador2.puntsAtac));
            System.out.println("Jugador1 danya a Jugador2");
        }

    //Jugador accio2

        if (estr1 == 2 && estr2 == 1){
            Jugador1.recuperaVida(Jugador1.TiraMonedes(Jugador1.puntsDefensa));
            System.out.println("Jugador1 recupera vida");
        }

        if (estr1 == 2 && estr2 == 3){
            Jugador1.restarVida(Jugador2.TiraMonedes(Jugador2.puntsAtac));
            Jugador1.restarVida(Jugador2.TiraMonedes(Jugador2.puntsAtac));
            System.out.println("Jugador2 danya a Jugador1 x2");
        }

        if (estr1 == 2 && estr2 == 4){
            Jugador1.recuperaVida(Jugador1.TiraMonedes(Jugador1.puntsDefensa));
            System.out.println("Jugador2 penalitza a Jugador1");
        }

    //Jugador accio3

        if (estr1 == 3 && estr2 == 1){
            Jugador1.restarVida(Jugador2.TiraMonedes(Jugador2.puntsAtac));
            System.out.println("Jugador2 danya a Jugador1");
        }

        if (estr1 == 3 && estr2 == 2){
            Jugador2.restarVida(Jugador1.TiraMonedes(Jugador1.puntsAtac));
            Jugador2.restarVida(Jugador1.TiraMonedes(Jugador1.puntsAtac));
            System.out.println("Jugador1 danya a Jugador2 x2");
        }

        if (estr1 == 3 && estr2 == 4){
            Jugador1.penalitzacio(Jugador2.TiraMonedes(Jugador2.puntsAtac));
            System.out.println("Jugador2 penalitza a Jugador1");
        }


    //Jugador accio4

        if (estr1 == 4 && estr2 == 1){
            Jugador1.restarVida(Jugador2.TiraMonedes(Jugador2.puntsAtac));
            System.out.println("Jugador2 danya a Jugador1");
        }

        if (estr1 == 4 && estr2 == 2){
            Jugador2.penalitzacio(Jugador1.TiraMonedes(Jugador1.puntsAtac));
            System.out.println("Jugador1 penalitza a Jugador2");
        }

        if (estr1 == 4 && estr2 == 3){
            Jugador2.penalitzacio(Jugador1.TiraMonedes(Jugador1.puntsAtac));
            System.out.println("Jugador1 penalitza a Jugador2");
        }

        Jugador1.MostrarEstadistiques();
        Jugador2.MostrarEstadistiques();



        //Guanya el jugador si consegueix matar a l'adverasi abans de morir ell. En el cas contrari, perd.
        if (Jugador1.puntsVida == 0){
            System.out.println("GAME OVER");
            System.out.println("Has perdut!");
        } else if (Jugador2.puntsVida == 0){
            System.out.println("FELICITATS");
            System.out.println("Has guanyat!");
        }
    }

    static int accioJugador(){
        Scanner sc = new Scanner(System.in);

        //Triem les estrategies del jugador
        System.out.println("1=Atac, 2=Defensa, 3=Engany, 4=Maniobra");
        return sc.nextInt();
    }

    static int accioAdversari(){
        //Triem les estrtategies de la maquina aleatoriament
        double accioAleat = Math.random();
        int accioAdv;
        if (accioAleat < 0.25)
            accioAdv = 1;
        else if (accioAleat < 0.50)
            accioAdv = 2;
        else if (accioAleat < 0.75)
            accioAdv = 3;
        else accioAdv = 4;

        return accioAdv;
    }

    static int triarClaseJugador(){
        Scanner sc = new Scanner(System.in);

        //Aqui l'usuari triarà la seva clase
        System.out.println("1 = Gegant (Extremadament resistent pero poc atac)");
        System.out.println("2 = Orcs (Gran defensa, un atac millorable)");
        System.out.println("3 = Humà (Estadístiques neutrals i equilibrades)");
        System.out.println("4 = Elf (Més coneguts pel seu atac que defensa)");
        System.out.println("5 = Goblin (Tan extremadament letals com febles)");
        return sc.nextInt();


    }

    static int triarClaseAdversari(){
        //La maquina triara la seva classe aleatoriament
        double aClassRandomizer = Math.random();
        int aClass;
        if (aClassRandomizer < 0.25)
            aClass = 1;
        else if (aClassRandomizer < 0.50)
            aClass = 2;
        else if (aClassRandomizer < 0.75)
            aClass = 3;
        else aClass = 4;

        System.out.print("Adversari ha triat el ");
        System.out.print(aClass);
        return aClass;
    }

}
