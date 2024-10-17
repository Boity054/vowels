/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowels;

import static com.mycompany.vowels.vowelCounter.countVowels;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Vowels {

    public static void main(String[] args, String sentence) {
        vowelCounter count=new vowelCounter();
        // Create a scanner object for user
         Scanner scanner = new Scanner(System.in); 

          // Prompt the user for sentences
        System.out.print("Enter a sentence: "); 
        String sentences = scanner.nextLine();
       

        int numberOfVowels = count.countVowels(sentences);
        System.out.println("Number of vowels: " + numberOfVowels);
    }
}
