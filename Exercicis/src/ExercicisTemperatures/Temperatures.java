package ExercicisTemperatures;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Temperatures {
    static Scanner sc = new Scanner(System.in);
    static MesuraDia[] mesueres;

    //El main es dedica a mostrar el menu principal, i dirigir a l'usuari cap a les dades o a sortir.
    public static void main(String[] args) {
        while (true) {

            //Primer mostram el menu principal perque l'usuari decidesqui que vol fer
            int opcio = MostrarMenuPrincipal();
            if (opcio == 1) {

                //Dirigim a l'usuari cap a la funcio de les dades
               SeleccionarDades();

            } else if (opcio == 2){
                FerMitjana();

            } else if (opcio == 3){
                System.out.println("Encara en producció..");


            } else if (opcio == 4) {

                //Feim un return per acabar el programa
                return;
            } else {
                System.out.println("Opció no valida");
            }
        }
    }



    //Aquesta funció exposa totes les opcions al usuari i les torna al main
    private static int MostrarMenuPrincipal() {

        System.out.println("1 = Mostrar la temperatura de un dia de un mes");
        System.out.println("2 = Mitjana de totes les dades de un mes");
        System.out.println("3 = Mitjana de totes les dades entre un inveral a triar");
        System.out.println("4 = Sortir");
        int option = sc.nextInt();
        return option;
    }

    private static void SeleccionarDades(){
        System.out.println("Mes de l'any?");
        int nMes = sc.nextInt();
        if (1 <= nMes & nMes <= 12) {
            System.out.println("Dia del mes? (01 - 31)");
            int nDia = sc.nextInt();
            calcDiaDelMes(nMes, nDia);
        } else System.out.println("NombreInvalid");

    }

    private static void calcDiaDelMes(int nMes, int nDia) {
        //Primer farem un array amb totes les linies de contingut de Temps.
         String data = Temps.data;
         String[] linea = data.split("\n");

         mesueres = new MesuraDia[linea.length-1];

         //Ara volem separar les linies per comes en uDada, i veure si els resultats son valids.
        for (int i = 0; i < linea.length; i++) {
            String[] uDada = linea[i].split(",", -1); //el -1 es per omitir els darrers camps buids
            if (uDada.length < 8){
                continue;
            }

            //El camp nº3 es el de la data, aixi que la pasarem a format de data
            LocalDate date =  LocalDate.parse((uDada[3]));

            int dia = date.getDayOfMonth();
            Month mes = date.getMonth();

            if (mes == Month.of(nMes)){
                if (dia == nDia){
                    System.out.print("La temperatura va ser: ");
                    System.out.println(uDada[5]);
                }
            }
        }
    }

    private static void FerMitjana() {
    }

}

