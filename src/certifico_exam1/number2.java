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
   
    private static int apple = 1 , banana = 2, durian = 3, kiwi = 4, lanzones = 5, mansanitas = 6, rambotan = 7 ;
    
public static void main(String[]args ){
    
    int [] arr = { banana, apple, lanzones, durian, rambotan, kiwi, mansanitas};
    System.out.println("Original Set of Array: ");
    printArray(arr);
    
    bubbleSort(arr);
    System.out.println("New Set of Array: ");
    printArray(arr);
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
