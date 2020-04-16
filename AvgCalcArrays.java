/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avg.calc.arrays;

 import java.util.Scanner;

public class AvgCalcArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in);
        
        int [ ] grades = new int [5];
        int avg = 0;
       //this section gets the users input for their grades
        System.out.println("Enter 5 of your grades to get your average");
        for (int i = 0; i <= 4; i = i + 1)
        {
           grades[i] = keyedInput.nextInt();
        }
        
        // this section calculates the average by addinmg and dividing
        for (int i = 0; i <= 4; i = i + 1)
        {
             avg = avg + grades[i];
        }
        avg = avg / 5;
        
        //this outputs the users average
        System.out.println("Your average is:"+ avg);
        
    }
    
}
