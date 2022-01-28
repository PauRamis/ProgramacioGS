package ExercicisClasses;
public class QuadratMagic {
     void imprimeix(int n) {
        int ar[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && j > 0) {
                    ar[i][j] = ar[i][j-1] + ar[i-1][j];

                } else ar[i][j] = 1;
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
