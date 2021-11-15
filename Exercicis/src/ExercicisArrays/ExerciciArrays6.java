package ExercicisArrays;

public class ExerciciArrays6 {
    public static void main(String[] args) {

    }

    static void dibuixCreu(boolean[][] ar){
        int centre = ar.length/2;
        boolean parell = (ar.length & 1) == 0;
        for (int i = 0; i < ar.length; i++) {
            ar[centre][i] = ar[i][centre] = true;
            if (parell){
                ar[centre-1][i] = ar[i][centre-1];
            }
        }
    }
}
