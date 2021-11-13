package PrimerContacte;

//"Escriu un programa que mostri per pantalla els 100 primers números senars."
public class Exercisi1 {
    public static void main(String[] args) {

//Cream la variable "n", a la qual li assignarem el valor "1"
        int n = 1;

//fem un while, que mentre "n" sigui més petit que 199, li sumi 2.
        while (n < 199) {
            n = n + 2;
            System.out.println(n);
        }
    }
}
