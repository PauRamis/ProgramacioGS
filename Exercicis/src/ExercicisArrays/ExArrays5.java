package ExercicisArrays;

public class ExArrays5 {
    public static void main(String[] args) {
/*         5- Per què no funciona el següent codi?
        int[] a;
        for (int i = 0; i < 10; i++)
            a[i] = i * i;

        L’array no està definit,la primera linia hauria de ser la aixi:”
*/
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = i * i;
    }
}
