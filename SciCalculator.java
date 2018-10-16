
import java.util.Scanner;
import java.math.*;
public class SciCalculator


{

    public static void main(String[] args)
    {
        Scanner newScanner = new Scanner(System.in);
        int option;

        double firstNum;  // first operand
        double secondNum;  // second operand
        double sumCalc = 0;
        int numCalc = 0;

        double curentRes = 0.0; // only displays once then loop will count it

        System.out.println("Current Result: " + curentRes);

        System.out.println("  ");
        boolean not7 = false;

        while (true)
        {
            if(!not7)
            {
                //displays menu
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");

                System.out.println(" ");

            }
            not7 = false;
            //sets boolean back so it will display menu

            {
                System.out.println(" ");
                System.out.print("Enter Menu Selection: ");
                // outside if statement so menu wont be repeated when option 7 used

                option = newScanner.nextInt();


                switch (option)

                {
                    case (0):
                    {
                        System.out.println(" ");
                        System.out.println("Thanks for using this calculator. Goodbye!");
                        System.exit(0); // ends entire program
                        break;
                    }

                    case (1): // addition
                    {
                        System.out.print("Enter first operand: "); // repeated in every case except 0
                        firstNum = newScanner.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondNum = newScanner.nextDouble();

                        // addition case adds first and second operand
                        double addition = firstNum + secondNum;
                        System.out.println(" ");
                        System.out.println("Current Result: " + addition);
                        System.out.println("  ");
                        sumCalc = addition + sumCalc;
                        numCalc++;


                        break;

                    }

                    case (2): // subtraction
                    {
                        System.out.print("Enter first operand: ");
                        firstNum = newScanner.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondNum = newScanner.nextDouble();

                        //first operand - second operand
                        double subtraction = firstNum - secondNum;
                        System.out.println(" ");
                        System.out.println("Current Result: " + subtraction);
                        System.out.println(" ");
                        sumCalc = subtraction + sumCalc;
                        numCalc++;
                        break;

                    }

                    case (3): //multiplication
                    {
                        System.out.print("Enter first operand: ");
                        firstNum = newScanner.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondNum = newScanner.nextDouble();

                        //first operand times second operand
                        double multiply = firstNum * secondNum;
                        System.out.println(" ");
                        System.out.println("Current Result: " + multiply);
                        System.out.println(" ");
                        sumCalc = multiply + sumCalc;
                        numCalc++;
                        break;

                    }

                    case (4): // division
                    {
                        System.out.print("Enter first operand: ");
                        firstNum = newScanner.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondNum = newScanner.nextDouble();

                        // first operand times second operand
                        double division = firstNum / secondNum;
                        System.out.println(" ");
                        System.out.println("Current Result: " + division);
                        System.out.println(" ");
                        sumCalc = division + sumCalc;
                        numCalc++;
                        break;

                    }
                    case (5): // power
                    {
                        System.out.print("Enter first operand: ");
                        firstNum = newScanner.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondNum = newScanner.nextDouble();

                        // first operand to the power of the second operand
                        double expon = Math.pow(firstNum, secondNum);
                        System.out.println(" ");
                        System.out.println("Current Result: " + expon);
                        System.out.println(" ");
                        sumCalc = expon + sumCalc;
                        numCalc++;
                        break;
                    }

                    case (6): // logs
                    {
                        System.out.print("Enter first operand: ");
                        firstNum = newScanner.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondNum = newScanner.nextDouble();

                        //log function holds true
                        double log = (Math.log(secondNum) / Math.log(firstNum));
                        System.out.println(" ");
                        System.out.println("Current Result: " + log);
                        System.out.println(" ");
                        sumCalc = log + sumCalc;
                        numCalc++;
                        break;

                    }

                    case (7): // don't show stats if no calculations have happened
                    {
                        if (numCalc == 0)
                        {
                            System.out.println(" ");
                            System.out.print("Error: No calculations yet to average!");
                            System.out.println(" ");
                            not7 = true;

                            break;
                        }

                        System.out.println(" ");
                        System.out.println("Sum of calculations: " + sumCalc); // should this round to two decimals
                        System.out.println("Number of calculations: " + numCalc);

                        double avgCalc =  Math.round(((sumCalc) /((double)numCalc)) * 100.0) / 100.0; // goes to 2 decimals because rounded then cut off
                       // System.out.printf("%.1f", avgCalc);
                        System.out.println("Average of calculations: " + avgCalc);
                        System.out.println(" ");
                        not7 = true;
                        break;


                    }
                    default: // all numbers not 0-7
                    {
                        System.out.println(" ");
                        System.out.println("Error: Invalid selection!");

                        not7 = true;



                        break;

                    }
                } // switch statement


            }


        } // while loop

    }
}
