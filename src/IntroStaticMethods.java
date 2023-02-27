import java.util.Scanner;

/**
 *
 * @author Tom Wulf Tom.Wulf@uc.edu
 */
public class IntroStaticMethods 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String trash = "";


        // Example #1 a method that prints hello
        int reps =  0; // number of hello to print

        // input reps
        do
        {
            System.out.print("How many hellos would you like? : ");
            if(in.hasNextInt())
            {
                reps = in.nextInt();
                in.nextLine();
                done = true;
            }
            else
            {
                System.out.println("Enter a valid integer. not: "+ trash);
            }
        }while (!done);

        // now call/invoke the method #1 in the loop
        for(int rep = 1; rep <= reps; rep++)
        {
            sayHello();
        }

        System.out.println();

        // Example #2 a method that prints a msg which is passed in as a parameter

        String msg = "";
        done = false;
        do {
            System.out.print("\nEnter the msg:");
            msg = in.nextLine();
            if(msg.length() > 0)
            {
                done = true;
            }
        }while (!done);

        // to save some time, we use the same reps

        for(int rep = 1; rep <= reps; rep++)
        {
            sayMessage(msg); // sayMessage("Hello Bill");
        }

        System.out.println();

        // for Example #3 we add the reps parameter and move the loop into the method!

        repeatMessage(msg, reps); // Here msg is a String variable we input
        repeatMessage("Get Bent!", 5); // here msg is a String literal and reps is a int literal
        repeatMessage("Kowabunga Dude!", 3); // same thing

        // for Example #4 we look at how a method can return a computed value
        // here we use a loop to create a table of ints and their squares

        System.out.println("\n\nBase   Square");
        for(int x = 1; x <= 12; x++)
        {
            System.out.printf("%5d%7d\n", x, squareIt(x));
        }

        // create a table of equivalent C and F temp values
        double fVal = 0.0;
        System.out.println("Celsius      Fareheit");

        for(double cTemp = 0.0; cTemp <= 150; cTemp += .1)
        {
            System.out.printf("%6.2f\t%6.2f\n",cTemp, ctoF(cTemp));
        }

        msg = getMessage(in);
        System.out.println("read msg as : " + msg);


    }  // This is the end of the main method

    /** Methods go here inside the class but after main.
     * if we declare variables in the class before main they
     * are class variables global ot the file and accessible from our methods.
     *
     */

    // Example #1

    /**
     *
     * Prints hello to the string with println
     *
     */
    private static void sayHello()
    {
        System.out.println("Hello");
    }  // this is eqivalent to the  return statement for void methods
       // non void must return a value

    // Example #2  Lets generalize it to say any message

    /**
     *
     * @param msg the message to be printed out
     */
    private static void sayMessage(String msg)
    {
        System.out.println(msg);
    }

    // example #3 Lets add another parameter and move the loop into the method!
    /**
     *
     * @param msg the message to be printed out
     * @param reps the number of times to print it
     */
    private static void repeatMessage(String msg, int reps)
    {
        for(int rep = 1; rep <= reps; rep++)
        {
            System.out.println(msg);
        }

    }

    // Example #4 returning a calculated value
    // the return type in type void is not to return anything
    // In O G Programming these were called procedures
    // Methods that return values are called functions and are used in assignments typically
    /**
     * Returns the square of the parameter base
     * @param base the number to square
     * @return the squared value
     */
    private static int squareIt(int base)
    {
        return base * base; // has to be an int since the method is typed int
    }

    // Example #5 creating a method for a familar formula

    /**
     *  Calculate the equivalent farenheit value for hte given celsius one
     * @param cVal celsiud val
     * @return farenheit Val
     */
    private static double ctoF(double cVal)
    {
       // double fVal = cVal * 9.0/5 + 32; // dont really need to do this...

       // return fVal;
       return  cVal * 9.0/5 + 32;  // here just return the double expression directly
    }

    private static String getMessage(Scanner in)
    {
        String msg = "";
        done = false;
        do {
            System.out.print("\nEnter the msg:");
            msg = in.nextLine();
            if(msg.length() > 0)
            {
                done = true;
            }
        }while (!done);

       return msg;
    }

    private void printTempTable()
    {
        double fVal = 0.0;

        System.out.println("Celsius      Fareheit");

        for(double cTemp = 0.0; cTemp <= 150; cTemp += .1)
        {
            System.out.printf("%6.2f\t%6.2f\n",cTemp, ctoF(cTemp));
        }
    }
} //  end of the class no code after this !!!