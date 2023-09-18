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
      int [] arr = {1,-2,3,-4,5};
        System.out.println("Original Array: ");
        for (int i : arr) {            
            System.out.println(i + " ");
        }
        System.out.println(" ");
        int sum=0;
        for (int num : arr) {
            if (num > 0) {
                sum+=num;
                        
            }
        }
        System.out.println("TOTAL OF ALL POSITIVE INTEGERS: " + sum);
    }
    
    public static void number2(){
          
    int [] arr = { 12,34,546,78,234,};
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
    
    
    public static void number3(){
         int [] arr = {3,2,1,5,4};
        
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (i<arr.length - 1) {
            }
        }
    }
    
    public static void number4(){
    int [] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i + " " );
            }
        }
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
            return fibonacci(n - 1) + fibonacci(n - 1);
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