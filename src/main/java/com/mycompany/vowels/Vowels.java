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
         Scanner scanner = new Scanner(System.in); // Create a scanner object for user input

        System.out.print("Enter a sentence: "); // Prompt the user for input
        String sentences = scanner.nextLine(); // Read the input sentence
       

        int numberOfVowels = count.countVowels(sentences); // Call the countVowels method
        System.out.println("Number of vowels: " + numberOfVowels); // Output the result
    }
}
