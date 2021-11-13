package PrimerContacte;//Escriu un programa que sumi els primers 40 números primers.

public class Exercisi5 {
    public static void main(String[] args) {

        //establim les variables que ens permetiran gestionar el programa
        int cont = 0;
        int candidat = 3;
        int suma = 1+2;

        //Començam mostrant els resultats dels 2 primers prims perque no entren bé dins el bucle
        System.out.println("1 -> 1");
        System.out.println("2 -> 2");

        //Fem el bucle per comprovar si son prims o no.
        while (cont<38){
            boolean Primer = true;
            for(int i = 2; i < candidat; i++){
                if(candidat % i == 0){

                    //Si no és primer, es descarta
                    Primer = false;
                    break;
                }

            }

            //Si és primer, imprimim el nombre, afegim "candidat" a "suma", i sumam 1 contador més.
            if(Primer){
                System.out.printf("%d -> %d\n", cont+3, candidat);
                suma = suma + candidat;
                cont++;
            }

            //Anam sumant 1 a  candidat
            candidat++;
        }
        //Al final, el programa donarà el resultat de la suma
        System.out.println("La suma de los primeros 40 primos es:" + suma);
    }
}

