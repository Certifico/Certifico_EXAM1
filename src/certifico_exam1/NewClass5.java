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
//number 4
public class NewClass5 {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        System.out.println("Your Arrays:" + Arrays.toString(array));
    }
    
    public static void positiveEvenNumbers(){
    
    }
    
    public static void printArray(){
    
    }
}
