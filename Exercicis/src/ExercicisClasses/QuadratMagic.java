package ExercicisClasses;

public class QuadratMagic {
    public static void main(String[] args) {
        int valorQuadrat = 5;
        int ar[][] = new int[valorQuadrat][valorQuadrat];

        for (int i = 0; i < valorQuadrat; i++) {
            for (int j = 0; j < valorQuadrat; j++) {
                if (i > 0 && j > 0) {
                    ar[i][j] = ar[i][j-1] + ar[i-1][j];

                } else ar[i][j] = 1;
                System.out.print(ar[i][j]);
            }
            System.out.println("");
        }
    }
}
