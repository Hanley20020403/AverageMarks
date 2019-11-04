/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package averagemarks;

import java.util.Scanner;

/**
 *
 * @author hahan0750
 */
public class AverageMarks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[                                                    ] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner (System.in);
        
        final int NUM = 5;
        double [] marks = new double[NUM];
        double average;
        double total;
        //set variable
        total = 0;
        
        System.out.println("please enter your last 5 marks: ");
        
        for (int i=0;i<NUM;i++)
        {
           marks[i] = keyedInput.nextDouble();
        }
        
        for(int i=0; i<NUM; i++)
        {
            total = total + marks[i];
        } 
        
        average = total / NUM;
        
        average = average * 100; 
        average = Math.round(average);
        average = average / 100; //Keep two decimal places
        
        System.out.println("Your average mark is " + average);
    }
    
}
