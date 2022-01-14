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
            int opcio = MostrarMenuPrincipal();
            if (opcio == 1) {

                //Dirigim a l'usuari cap a la funcio de les dades
               SeleccionarDades();

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
        System.out.println("3 = ");
        int option = sc.nextInt();
        return option;
    }

    private static void SeleccionarDades(){
        System.out.println("Mes de l'any?");
        int nMes = sc.nextInt();
        if (1 <= nMes & nMes <= 12) {
            System.out.println("Dia del mes? (01 - 31)");
            int nDia = sc.nextInt();
            calcDades(nMes, nDia);
        } else System.out.println("NombreInvalid");

    }

    private static void calcDades(int nMes, int nDia) {
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
                    System.out.print("Tavg: ");
                    System.out.println(uDada[5]);
                }
            }
        }
    }

}

