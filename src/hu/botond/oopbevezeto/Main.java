package hu.botond.oopbevezeto;

import hu.botond.oopbevezeto.kor.Kor;
import hu.botond.oopbevezeto.pont.Pont;

public class Main {
    public static void main(String[] args) {
        Kor[] korok = new Kor[10];

        for (int i = 0; i < korok.length; i++) {
            korok[i] = new Kor();
            System.out.println(i + 1 + ". kör adatai: " + korok[i]);
        }

        Kor hArea = korok[0];
        for (int i = 0; i < korok.length; i++) {
            if (korok[i].getArea() > hArea.getArea()){
                hArea = korok[i];
            }
        }
        System.out.println("Legnagyobb területtel rendelkező kör: " + hArea);

    }
}