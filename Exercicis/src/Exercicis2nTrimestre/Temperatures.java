package Exercicis2nTrimestre;

import java.util.Scanner;

public class Temperatures {
    static Scanner sc = new Scanner(System.in);

    //El main es dedica a mostrar el menu principal, i dirigir a l'usuari cap a les dades o a sortir.
    public static void main(String[] args) {
        while (true) {
            int opcio = MostrarMenuPrincipal();
            if (opcio == 1) {

                //Dirigim a l'usuari cap a la funcio de les dades
                MostrarDades();

            } else if (opcio == 2) {

                //Feim un return per acabar el programa
                return;
            } else {
                System.out.println("Opció no valida");
            }
        }
    }

    private static int MostrarMenuPrincipal() {
        System.out.println("1 = Mostrar les dades de un més");
        System.out.println("2 = Sortir");
        int option = sc.nextInt();
        return option;
    }

    private static void MostrarDades(){
        System.out.println("Mes de l'any?");
        int nMes = sc.nextInt();
        if (1 <= nMes & nMes <= 12) {
            System.out.println("Dia del mes? (01 - 31)");
            int nDia = sc.nextInt();
            calcDades(nMes, nDia);
        } else System.out.println("NombreInvalid");

    }

    private static String calcDades(int nMes, int nDia) {
         String data = Temps.data;
         String[] infoData = data.split("+");
         String diaData = infoData[nDia]; // 123

        return diaData;
        }

    }

