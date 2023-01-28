//import java.util.Scanner;

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


        /*
         *        Scanner inpObj = new Scanner(System.in);
         *
         *        int points = 0;
         *
         *        //        Question 1
         *        System.out.println("1. Who created Minecraft?");
         *        String userInp =  inpObj.next();
         *        if (userInp.equals("notch")) {
         *            System.out.println("Correct");
         *            points++;
         *        } else {
         *            System.out.println("Incorrect!");
         *            System.out.println("The answer is: notch.");
         *        }
         *        //        Question 2
         *        System.out.println("2. what's the capital city of indonesia?");
         *        String userInp2 =  inpObj.next();
         *        if (userInp2.equals("jakarta")) {
         *            System.out.println("Correct");
         *            points++;
         *        } else {
         *            System.out.println("Incorrect!");
         *            System.out.println("The answer is: 19.");
         *        }
         *        //        Question 3
         *        System.out.println("3. do i like coding?");
         *        String userInp3 =  inpObj.next();
         *        if (userInp3.equals("yes")) {
         *            System.out.println("Correct");
         *            points++;
         *        } else {
         *            System.out.println("Incorrect!");
         *            System.out.println("The answer is: yes.");
         *        }
         *        System.out.println("Your total point is: "+ points);
         */

        /* EXERCISE & SOLUTION 2  */

        /*
         * Exercise 2:
         * a) Re-create the Trivia Game from before. This time with 5 Questions & 5 Answers!
         *  Use Arrays to save the question and answers.
         *  Create at least two methods that make the code more readable and easier to follow.
         *    --> Hint: Duplicate code can usually be made into methods
         *  BONUS:  Use an endless while loop with if statements so the user can play until they don't want anymore.
         *
         * OPTIONAL HARDER EXERCISE (Without Solution):
         * b) Create a very simple version of Tik Tak Toe
         *  Hints: Use one array to save the board. Think about what type of data you need!
         *         Use methods to properly print out each row of the board.
         *         Make it a two Player Game (making an AI is too advanced :P)
         *         You will need to use Loops here as well!
         *
         */

//        String[] questions = new String[5];
//        questions[0] = "1. who created Minecraft?";
//        questions[1] = "2. what's the capital city of indonesia?";
//        questions[2] = "3. do i like coding?";
//        questions[3] = "4. what's my fav food?";
//        questions[4] = "5. what's my hobby?";
//
//        String[] answers = new String[5];
//        answers[0] = "notch";
//        answers[1] = "jakarta";
//        answers[2] = "yes";
//        answers[3] = "chicken";
//        answers[4] = "workout";
//        int points = 0;
//
//
//
//        //        Question 1
//        System.out.println(questions[0]);
//        points += checkAnswer(answers[0]);
//        //        Question 2
//        System.out.println(questions[1]);
//        points += checkAnswer(answers[1]);
//        //        Question 3
//        System.out.println(questions[2]);
//        points += checkAnswer(answers[2]);
//        //        Question 4
//        System.out.println(questions[3]);
//        points += checkAnswer(answers[3]);
//        //        Question 5
//        System.out.println(questions[4]);
//        points += checkAnswer(answers[4]);
//
//        // Total Points
//        System.out.println("Total Points: " + points);
//    }
//    public static int checkAnswer(String answers) {
//        Scanner inpObj = new Scanner(System.in);
//        String userInp = inpObj.next();
//        if (userInp.equals(answers)) {
//            System.out.println("Correct");
//            return 1;
//        } else {
//            System.out.println("Incorrect!");
//            System.out.println("The answer is: " + answers);
//            return 0;
//        }

//        Practicing OOP Inheritance
//        Car bmw = new Car("Land","BMW");
//        Motorcycle ninja = new Motorcycle("Land","Ninja");
//
//        bmw.turn("Right");
//        bmw.honk();
//        System.out.println(bmw.wheels);
//        ninja.wheeling(6);
//        ninja.turn("Left");

        /*
         * Exercise 3:
         * a) Trivia Game with CLASSES and Objects:
         * Modify the Trivia Game we have made in the previous two exercises in such a way to use Classes as well.
         * Imagine possible making custom classes for Question Answer Pairs, using Lists to save them
         *
         * b) Bank Management System:
         * Create a Bank Management System which has the following components:
         * Person (which saves first, middle and last name, age and a "social security number")
         * Bank (which saves a List of customers and their Checking Accounts, maximum overdraw amount)
         * Checking Account (should have a current value, methods for taking and depositing money)
         * Opening a Checking Account should only work via a Bank and must require a certain amount of initial deposit.
         *
         * BONUS: Make the Banking System Interactive (No Solution provided!)
         *
         *
         */

        Person maria = new Person("Maria","James",25,441);
        Person lebron = new Person("Lebron","Jonathan",22,434);
        maria.deposit(400);
        lebron.deposit(600);
        lebron.withdraw(300);

        lebron.checkAccount();
        maria.checkAccount();
        System.out.println(Bank.totalPerson);
    }
}