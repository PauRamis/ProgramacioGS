package ExercicisClasses;

import java.util.Random;

public class Baralla {
    Carta[] cartes = new Carta[48];

    Baralla(){
        Carta.Pal[] pals = Carta.Pal.values();
        Carta.Nums[] nums = Carta.Nums.values();
        int pos = 0;
        for (int i = 0; i < pals.length; i++) {
            for (int j = 0; j < nums.length; j++) {
              this.cartes[pos] = new Carta(pals[i], nums[j]);
              pos++;
            }
        }
    }

    public void imprimeix(){
        for (int i = 0; i < cartes.length; i++) {
            System.out.println(this.cartes[i].imprimeix());
        }
    }

    public void mezclar() {
        Carta[] ar = this.cartes;
        Random random = new Random();
        for (int i = 0; i < ar.length; i++) {
            int aleatori = random.nextInt(ar.length - i) + i;
            Carta temp = ar[i];
            ar[i] = ar[aleatori];
            ar[aleatori] = temp;
        }
    }
}
