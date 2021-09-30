/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktvp20task5angelina;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Angelina
 */
public class SKTVp20Task5Angelina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] ar = new int[5][];
        ar[0] = new int[3];
        ar[1] = new int[5];
        ar[2] = new int[7];
        ar[3] = new int[8];
        ar[4] = new int[9];
        
        Random random = new Random();
    
        System.out.println("Неотсортированный зубчатый массив:");
        
        for(int i=0; i < ar.length; i++) {
            for(int j = 0; j < ar[i].length; j++) {
                ar[i][j] = random.nextInt(100-50+1)+50;
                System.out.printf("%5d", ar[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("Отсортированный зубчатый массив:");

        boolean isSorted = false;
        
        do {
            isSorted = true;
            for(int i=0; i<ar.length; i++) {
                for(int j=0; j<ar[i].length-1; j++) {
                    if (ar[i][j]>ar[i][j+1]) {
                        int temp=ar[i][j];
                        ar[i][j]=ar[i][j+1];
                        ar[i][j+1]=temp;
                        isSorted=false;
                    }
                }
            }
            for (int i=0; i<ar.length-1; i++) {
                if ((ar[i][ar[i].length-1])>ar[i+1][0]) {
                    int temp=ar[i][ar[i].length-1];
                    ar[i][ar[i].length-1] = ar[i+1][0];
                    ar[i+1][0] = temp;
                    isSorted=false;
                }
            }   
        } while (!isSorted);
        
        for(int i=0; i < ar.length; i++) {
            for(int j = 0; j < ar[i].length; j++) {
                System.out.printf("%5d", ar[i][j]);
            }
        System.out.println("");
        }
}
}