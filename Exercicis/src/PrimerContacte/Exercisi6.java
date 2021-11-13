package PrimerContacte;//"Escriu un programa que mostri els primers 30 múltiples de 5 que no són múltiples de 3".

public class Exercisi6 {
    public static void main(String[] args) {
        int contador = 0;
        int num = 1;

        //Posam un while fins a 30, per que ens doni 30 numeros
        while (contador < 30) {

            //Fem un if, que mirarà si el numero és multiple de 5 i no de 3
            if ((num % 3 != 0) && (num % 5 == 0)){

                //Si ho és, imprimim el numero
                System.out.println(num);
                contador++;
            }
            //Sigi o no multiple, sumam 1 al contador
            num++;
        }
    }
}
