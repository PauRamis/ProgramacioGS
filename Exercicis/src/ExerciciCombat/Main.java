package ExerciciCombat;

import java.util.Scanner;

//Aquest es un joc tipus pedra, paper, estisores, però més complexe i amb tematica de RPG.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Primer cream dos jugadors, Jugador1 i Jugador2.
        System.out.println("Nombra el teu Personatge:");
        String nomJ = sc.nextLine();
        Jugador Jugador1 = new Jugador(nomJ);
        System.out.println("Nombra el teu Adversari:");
        String nomA = sc.nextLine();
        Jugador Jugador2 = new Jugador(nomA);

        int cJug = triarClaseJugador();
        int cAdv = triarClaseAdversari();

        Jugador1.ClaseElegida(cJug);
        Jugador2.ClaseElegida(cAdv);

        //Mostram a l'usuari les estadistiques dels dos jugadors i començam la ronda
        Jugador1.MostrarEstadistiques();
        Jugador2.MostrarEstadistiques();

        //Feim 10 rondes. Cada ronda el Jugador guanya experiencia i pot pujar de nivell.
        for (int i = 0; i < 10; i++) {
            ronda(Jugador1, Jugador2);
            Jugador1.recuperaVida(50);
            Jugador2.recuperaVida(50);
            Jugador1.puntsExp = Jugador1.puntsExp + 25;
            if (Jugador1.puntsExp == 100) {
                Jugador1.nivell++;
                Jugador1.puntsExp = 0;
                Jugador1.puntsVidaMax = Jugador1.puntsVidaMax + 2;
                Jugador1.puntsVida = Jugador1.puntsVida + 2;

                System.out.println("Has pujat de nivell!");
                System.out.println("+2 de vida maxima");

                //Aleatoriament es tria si pujar l'atac o la defensa
                double nivellAleat = Math.random();
                if (nivellAleat < 0.50) {
                    Jugador1.puntsAtac++;
                    System.out.println("+1 d'atac");
                } else {
                    Jugador1.puntsDefensa++;
                    System.out.println("+1 de defensa");
                }
            }
        }
        resultats(Jugador1.nivell, Jugador1.puntsExp);
    }

    //Cuan el joc acaba, perque has guanyat 10 vegades o has mort, es mostren els teus resultats.
    private static void resultats(int nivell, int puntsExp) {
        System.out.println("El teu resultats són: ");
        System.out.printf("Nivell: %s Punts d'Experiencia: %d\n", nivell, puntsExp);
    }


    static void ronda(Jugador Jugador1, Jugador Jugador2) {
        while (!gameEnd(Jugador1, Jugador2)) {
            System.out.println("Tria la teva acció!");
            int estr1 = accioJugador();
            int estr2 = accioAdversari();

            System.out.println("L'adversari ha triat: ");
            System.out.println(estr2);

            switch (estr1) {
                //Jugador accio 1
                case 1:
                    if (estr2 == 1) {
                        Jugador1.restarVida(Jugador2.TiraMonedes(Jugador2.puntsAtac));
                        Jugador2.restarVida(Jugador1.TiraMonedes(Jugador1.puntsAtac));
                        System.out.println("Jugadors 1 y 2 es danyen mutuament");
                    }
                    if (estr2 == 2) {
                        Jugador2.recuperaVida(Jugador2.TiraMonedes(Jugador2.puntsDefensa));
                        System.out.println("Jugador2 recupera vida");
                    }
                    if (estr2 == 3) {
                        Jugador2.restarVida(Jugador1.TiraMonedes(Jugador1.puntsAtac));
                        System.out.println("Jugador1 danya a Jugador2");
                    }
                    if (estr2 == 4) {
                        Jugador2.restarVida(Jugador1.TiraMonedes(Jugador1.puntsAtac));
                        System.out.println("Jugador1 danya a Jugador2");
                    }
                    break;

                //Jugador accio2
                case 2:
                    if (estr2 == 1) {
                        Jugador1.recuperaVida(Jugador1.TiraMonedes(Jugador1.puntsDefensa));
                        System.out.println("Jugador1 recupera vida");
                    }
                    if (estr2 == 2) {
                        Jugador1.recuperaVida(Jugador1.TiraMonedes(Jugador1.puntsDefensa));
                        Jugador2.recuperaVida(Jugador2.TiraMonedes(Jugador2.puntsDefensa));
                        System.out.println("Jugador1 y Jugador2 recuperan vida");
                    }
                    if (estr2 == 3) {
                        Jugador1.restarVida(Jugador2.TiraMonedes(Jugador2.puntsAtac));
                        Jugador1.restarVida(Jugador2.TiraMonedes(Jugador2.puntsAtac));
                        System.out.println("Jugador2 danya a Jugador1 x2");
                    }
                    if (estr2 == 4) {
                        Jugador1.penalitzacio(Jugador2.TiraMonedes(Jugador2.puntsDefensa));
                        System.out.println("Jugador2 penalitza a Jugador1");
                    }
                    break;

                //Jugador accio3
                case 3:
                    if (estr2 == 1) {
                        Jugador1.restarVida(Jugador2.TiraMonedes(Jugador2.puntsAtac));
                        System.out.println("Jugador2 danya a Jugador1");
                    }
                    if (estr2 == 2) {
                        Jugador2.restarVida(Jugador1.TiraMonedes(Jugador1.puntsAtac));
                        Jugador2.restarVida(Jugador1.TiraMonedes(Jugador1.puntsAtac));
                        System.out.println("Jugador1 danya a Jugador2 x2");
                    }
                    if (estr2 == 3) {
                        Jugador1.restarVida(Jugador2.TiraMonedes(Jugador2.puntsAtac));
                        Jugador2.restarVida(Jugador1.TiraMonedes(Jugador1.puntsAtac));
                        System.out.println("Jugadors 1 y 2 es danyen mutuament");
                    }
                    if (estr2 == 4) {
                        Jugador1.penalitzacio(Jugador2.TiraMonedes(Jugador2.puntsDefensa));
                        System.out.println("Jugador2 penalitza a Jugador1");
                    }
                    break;

                //Jugador accio4
                case 4:
                    if (estr2 == 1) {
                        Jugador1.restarVida(Jugador2.TiraMonedes(Jugador2.puntsAtac));
                        System.out.println("Jugador2 danya a Jugador1");
                    }
                    if (estr2 == 2) {
                        Jugador2.penalitzacio(Jugador1.TiraMonedes(Jugador1.puntsDefensa));
                        System.out.println("Jugador1 penalitza a Jugador2");
                    }
                    if (estr2 == 3) {
                        Jugador2.penalitzacio(Jugador1.TiraMonedes(Jugador1.puntsDefensa));
                        System.out.println("Jugador1 penalitza a Jugador2");
                    }
                    if (estr2 == 4) {
                        Jugador1.penalitzacio(Jugador2.TiraMonedes(Jugador2.puntsDefensa));
                        Jugador2.penalitzacio(Jugador1.TiraMonedes(Jugador1.puntsDefensa));
                        System.out.println("Jugador1 y Jugador2 son penalitzats");
                    }
                    break;
            }

            //Mostram com han quedat les estadistiques de cada jugador
            Jugador1.MostrarEstadistiques();
            Jugador2.MostrarEstadistiques();
        }
    }

    static boolean gameEnd(Jugador Jugador1, Jugador Jugador2) {
        //Guanya el jugador si consegueix matar a l'adverasi abans de morir ell. En el cas contrari, perd.
        boolean end = false;
        if (Jugador1.puntsVida == 0) {
            System.out.println("GAME OVER");
            System.out.println("Has perdut!");
            end = true;
            resultats(Jugador1.nivell, Jugador1.puntsExp);
            System.exit(0);

        } else if (Jugador2.puntsVida == 0) {
            System.out.println("FELICITATS");
            System.out.println("Has guanyat!");
            end = true;
        }
        return end;
    }

    static int accioJugador() {
        Scanner sc = new Scanner(System.in);

        //Triem les estrategies del jugador
        System.out.println("1=Atac, 2=Defensa, 3=Engany, 4=Maniobra");
        return sc.nextInt();
    }

    static int accioAdversari() {
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

    static int triarClaseJugador() {
        Scanner sc = new Scanner(System.in);

        //Aqui l'usuari triarà la seva clase
        System.out.println("Tria la teva classe preferida");
        System.out.println("1 = Gegant (Extremadament resistent pero poc atac)");
        System.out.println("2 = Orcs (Gran defensa, un atac millorable)");
        System.out.println("3 = Humà (Estadístiques neutrals i equilibrades)");
        System.out.println("4 = Elf (Més coneguts pel seu atac que defensa)");
        System.out.println("5 = Goblin (Tan extremadament letals com febles)");
        return sc.nextInt();

    }

    static int triarClaseAdversari() {
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
        System.out.println(aClass);
        return aClass;
    }

}
