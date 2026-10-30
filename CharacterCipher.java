// Problem : lowercase to uppercase & building tiny encryption tools ..

import java.util.Scanner; // import the scanner class

public class CharacterCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write one lowercase Alphabet: ");
        char alphabet = sc.next().charAt(0);

        int asciiValue = alphabet;
        System.out.println("ASCII Value: " + asciiValue);

        int upperCase = alphabet - 32;
        System.out.println("Uppercase Letter: " + (char) upperCase);

        char cipherLetter = (char) (asciiValue + 3); //  you can use any one -> ( asciiValue + 3 / alphabet + 3 )
        System.out.println("Cipher Letter (+3 Shift): " + cipherLetter);

        sc.close(); // prevent the data from being leaked ..

    }
}
