package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random newRandom = new Random ();
        int r= newRandom.nextInt(3)+1;{
            System.out.println("ДАВАЙ ПОИГРАЕМ! \n УГАДАЙ ОТ 1 до 3 !");}


        Scanner NewScanner = new Scanner(System.in);

        int s = NewScanner.nextInt();
        for (int ac=3;ac>0;--ac) {
            if (s>r || s<r ) {System.out.println("Вы не угадали! Осталось попыток:" +ac);}
            if (s==r)  {
                System.out.println("ВЫ УГАДАЛИ!"); break;
            }
            s= NewScanner.nextInt();
        }



        if (s==r) {
            System.out.println("Вы ВЫИГРАЛИ!");}
        else  {

            System.out.println("ВЫ Проиграли!");
        }


        // write your code here}
    }


}

   












