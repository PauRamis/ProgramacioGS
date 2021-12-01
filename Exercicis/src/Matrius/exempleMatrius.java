package Matrius;

import java.util.Scanner;

public class exempleMatrius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu els numeros de la matriu separats per espais");
        while(true){
            String linea = scanner.nextLine();
            String[] ar = linea.split("");
            for (int i = 0; i < ar.length; i++) {
                double element = Double.parseDouble(ar[i]);
            }

        }
    }
}
