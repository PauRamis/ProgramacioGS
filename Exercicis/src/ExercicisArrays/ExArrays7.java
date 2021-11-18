package ExercicisArrays;

public class ExArrays7 {
    public static void main(String[] args) {

//  7- Què mostra el següent codi?
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(a[i]);

//  Crea un array de 9 a 0, i l’inverteix. Mostrarà l’array de 0 a 9.

    }
}
