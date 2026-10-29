// problem ; find the ASCII value of upper case alphabet ..

import java.util.Scanner;

public class ASCIIOfUpperCaseAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write any uppercase alphabet ASCII value: ");
        char alphabet = sc.nextLine().charAt(0);

        int asciiValue = alphabet;
        System.out.println("ASCII: " + asciiValue); // ASCII value

        int actualPosition = alphabet - 64; // actual position in alphabet
        System.out.println("the actual position: " + actualPosition);

        int lowerCase = alphabet + 32; // in lowercase
        System.out.println("lowercase: " + (char) lowerCase);

        sc.close(); // prevent the data from being leaked ..

    }

}
