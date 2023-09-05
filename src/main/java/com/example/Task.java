package com.example;

import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размер массива");
        Scanner scanSize = new Scanner(System.in);
        int size = scanSize.nextInt();
        int array[] = new int[size];
        System.out.println("Заполните массив через энтер");
        for (int i=0; i<array.length; i++)
        {
            Scanner Date = new Scanner(System.in);
            int arrayDate = Date.nextInt();
            array[i]=arrayDate;
        }
        int x=20;
        int y=15;
        int z=31;
        for (int i = 0; i < size; i++) {
            if (array[i]==x || array[i]==y || array[i]==z) {
                System.out.print ("Данное значение имеется в константах ");
                break;
            }
        }
    }
}
