// Problem : Character Anatomy & Vowel/Consonant Analyzer ..

import java.util.Scanner;

public class AlphabetAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write one Character: ");
        char character = sc.next().charAt(0);

        if ((int) character >= 65 && (int) character <= 90) {
            System.out.println("the character " + character + " is in Uppercase");
        }

        else if ((int) character >= 97 && (int) character <= 122) {
            System.out.println("the character " + character + " is in Lowercase");
        }

        else if ((int) character >= '0' && (int) character <= '9') {
            System.out.println("the character " + character + " is Digit");
        }

        else {
            System.out.println("invalid Input");
        }

        if (((int) character >= 65 && (int) character <= 90) || ((int) character >= 97 && (int) character <= 122)) {

            switch (character) {

                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    System.out.println("the character " + character + " is Vowel");
                    break;

                default:
                    System.out.println("the character " + character + " is Consonant");

            }

        }

        sc.close();

    }

}
