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
//number 5
public class NewClass6 {
    
    public static void main(String []args){
    Scanner scn = new Scanner(System.in);
        System.out.println("Enter Desired Number:  ");
        int result = scn.nextInt();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci(i) +"");
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
}
