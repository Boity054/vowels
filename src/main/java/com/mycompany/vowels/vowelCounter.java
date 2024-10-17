/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vowels;

/**
 *
 * @author RC_Student_lab
 */
public class vowelCounter {
    public static int countVowels(String sentence){
        int vowelCount = 0;
        String vowels = "aeiou"; 

        // Convert the sentence to lowercase to handle case insensitivity
        sentence = sentence.toLowerCase();

        // Iterate through each character in the string
        for (int i = 0; i < sentence.length(); i++) {
            char currentCharater = sentence.charAt(i);
        }

        return vowelCount; 
    }
    }

