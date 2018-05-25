package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число -");
            Double e = sc.nextDouble();


            System.out.println("Введите максимальное число элементов (целое положительное) -");
            int n = sc.nextInt();
            sc.close();
            if (n < 0) {
                System.out.println("Число не положительное");
                return;
            }


            double[] a = new double[n];
            int i;
            for (i = 0; i < n; i++) {
                a[i] = 1 / Math.pow((i + 1), 2);
                System.out.println(a[i]);
                if (a[i] < e) {
                    System.out.println("Номер элемента");
                    System.out.println(i + 1);
                    break;
                }
            }
        }
         catch (InputMismatchException e) {
            System.out.println("Введено не корректное число");
        }


    }
}
