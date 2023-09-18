/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certifico_exam1;

/**
 *
 * @author khian
 */

import java.util.Scanner;
import java.util.Arrays;
//NUMBER 2
public class number2 {
        
public static void main(String[]args ){
    Scanner scn = new Scanner(System.in);
    System.out.println("Set a Set of Array: ");
    int result = scn.nextInt();
    
}

public static void bubbleSort(int [] arr){
      int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr [j] > arr [j + 1]) {
                    int m = arr[j];
                    arr[j]= arr[j + 1];
                    arr[j + 1] = m;
                    
                }
            }
        }
        
}

public static void printArray(int [] arr){
    
    for (int num : arr) {
        System.out.println(num + " ");
    }
}
}