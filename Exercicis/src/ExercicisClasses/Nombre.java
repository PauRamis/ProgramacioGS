package ExercicisClasses;

public class Nombre {
    int valor;

    Nombre(int valor) {
        this.valor = valor;
    }

    Nombre(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result += valorDigitRoma(c);
        }
        this.valor = result;

    /*    int n = this.valor;
        int millars = n/1000;
        n %= 1000;
        int centers = n/100;
        n %= 100;
        int desena = n/10;
        n %= 10;
        int unitats = n;
        */
    }

    private char valorDigitRoma(char c) {
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;

        }
        return 0;
    }

    String hex() {
        String binari = this.bin();
        binari = ompleCeros(binari);
        String result = "";
        for (int i = 0; i < binari.length() / 4; i++) {
            String grup4 = binari.substring(i*4, i*4*i);
            result = result + getMaxDigit(grup4);

        }

        return binari;
    }

    private String getMaxDigit(String grup4) {
        switch (grup4){
            case "0000": return "0";
            case "0001": return "1";
            case "0010": return "2";
            case "0011": return "3";
            case "0100": return "4";
            case "0101": return "5";
            case "0110": return "6";
            case "0111": return "7";
            case "1000": return "8";
            case "1001": return "9";
            case "1010": return "A";
            case "1011": return "B";
            case "1100": return "C";
            case "1101": return "D";
            case "1110": return "E";
            case "1111": return "F";

        }
        return "X";
    }

    private String ompleCeros(String binari) {
        int binariLenght = binari.length();
        if (binariLenght % 4 != 0){
            int n = 4 - (binariLenght % 4);
            for (int i = 0; i < n; i++) {
                binari = "0" + binari;
            }
        }
        return binari;

    }

    String bin() {
        String resultat = "";
        int n = this.valor;
        while (n > 0) {
            int bit = n & 1;
            if (bit == 0) {
                resultat = "0" + resultat;
            } else {
                resultat = "1" + resultat;
            }
            n = n >> 1;
        }
        return resultat;
    }

}
