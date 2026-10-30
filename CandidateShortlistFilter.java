// Problem : without using if - else, making one shortlist filter for candidates

import java.util.Scanner;

public class CandidateShortlistFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Coding Testscore: ");
        int codingTestScore = sc.nextInt();

        System.out.print("Projects Builts: ");
        int projectsBuilt = sc.nextInt();

        System.out.print("Do you have GitHUB portfolio: ");
        boolean hasGithubPortfolio = sc.nextBoolean();

        System.out.print("Any Caught Plagiar: ");
        boolean caughtPlagiarizing = sc.nextBoolean();

        boolean isShortListed = ((codingTestScore >= 75 && codingTestScore <= 100) && projectsBuilt >= 2
                && hasGithubPortfolio && !caughtPlagiarizing);

        System.out.println("are you short listed : " + isShortListed);

        // Problem : find the value of a .

        int a = 10;
        int finalAnswer = --a + a++ * 3 - ++a;

        // Brain dry run :
        // 9 + 9 * 3 - 11
        // 9 + 27 - 11
        // 36 - 11
        // answer - > 25

        System.out.println("the actual value of a: " + a);
        System.out.println("Final Answer: " + finalAnswer);

        sc.close(); // prevent the data from being leaked ..

    }
}
