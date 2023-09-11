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
public class Certifico_Exam1 {
    public static Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        displayMenu();
        TheMenu();
    }
    public static void displayMenu(){
        System.out.println("EXAM TIME");
    }
    public static void TheMenu(){
        System.out.println("PRESS [1]");
        System.out.println("PRESS [2]");
        System.out.println("PRESS [3]");
        System.out.println("PRESS [4]");
        System.out.println("PRESS [5]");
        System.out.println("Press [6] EXIT");
        int choice = userChoice(1, 5);
        
        switch (choice) {
            case 1:
                number1();
                break;
            case 2:
                number2();
                break;
            case 3:
                number3();
                break;
            case 4:
                number4();
                break;
            
            case 5:
                number5();
                break;
            case 6:
                scn.close();
                System.out.println("Thank you ");
            default:
                System.out.println("USABA");
                break;
        }
    }
    
    public static void number1(){
      int [] arr = {1, -2, 3, -4, 5};
        System.out.println(Arrays.toString(arr));
    }
    
    public static void number2(){
    
    }
    
    public static void number3(){
 
    }
    
    public static void number4(){
    int [] arr = {1, -2, 3, -4, 5};
        System.out.println(Arrays.toString(arr));
    }
    
   public static void number5(){
       
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Desired Number:  ");
        int result = scn.nextInt();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci(i) +" ");
            scn.close();
        }
        
    }
    public static int fibonacci(int n){
      if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
   
   
    public static void bubbleSort(int arrey[]){
        int n = arrey.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arrey [j] > arrey [j + 1]) {
                    int m = arrey[j];
                    arrey[j]= arrey[j + 1];
                    arrey[j + 1] = m;
                    
                }
            }
        }
        
    }
    public static void printArray(int arrey[]){
        for (int num : arrey) {
            System.out.println(num + " ");
        }
    } 

    private static int userChoice(int min, int max) {
        int choice;
        while (true) {            
            System.out.println("Enter your Choice: ");
            choice = scn.nextInt();
            if (choice >= min && choice <= max) {
                break;
            }
            System.out.println("USABA");
        }
        return choice;
    }
    }
    

