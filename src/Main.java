import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXERCISE 1 */

        /*
         * CREATE A SIMPLE TRIVIA GAME
         *
         * Define (at least) three questions with three answers.
         * Prompt the User the type in their answer using the Scanner, you've seen in the output/input video
         * Then use if/else statements to check if the answer from the user is correct! And output that they were.
         * If they were wrong, tell the user and output the correct answer.
         *
         * BONUS: increment a points total each time the user is correct and at the end make a unique output for each
         * score the user might have (0 to 3)
         *
         * IMPORTANT TIPS:
         * 1. When reading in Strings from the user use scanner.next() (NOT scanner.nextLine())
         * 2. When you have an answer and input that are both strings you will have to use:
         *    userInput.equals(answer) instead of userInput == answer
         */
        Scanner inpObj = new Scanner(System.in);

        int points = 0;

        //        Question 1
        System.out.println("1. Who created Minecraft?");
        String userInp =  inpObj.next();
        if (userInp.equals("notch")) {
            System.out.println("Correct");
            points++;
        } else {
            System.out.println("Incorrect!");
            System.out.println("The answer is: notch.");
        }
        //        Question 2
        System.out.println("2. what's the capital city of indonesia?");
        String userInp2 =  inpObj.next();
        if (userInp2.equals("jakarta")) {
            System.out.println("Correct");
            points++;
        } else {
            System.out.println("Incorrect!");
            System.out.println("The answer is: 19.");
        }
        //        Question 3
        System.out.println("3. do i like coding?");
        String userInp3 =  inpObj.next();
        if (userInp3.equals("yes")) {
            System.out.println("Correct");
            points++;
        } else {
            System.out.println("Incorrect!");
            System.out.println("The answer is: yes.");
        }
        System.out.println("Your total point is: "+ points);
    }
}