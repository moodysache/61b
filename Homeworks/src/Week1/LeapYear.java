package Week1;

import java.util.Scanner;

/** Class that determines whether or not a year is a leap year.
 *  @author YOUR NAME HERE
 */
public class LeapYear {

    /** Calls isLeapYear to print correct statement.
     *  @param  year to be analyzed
     */
    private static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year);
        } else {
            System.out.printf("%d is not a leap year.\n", year);
        }
    }

    /** Must be provided an integer as a command line argument ARGS. */
    public static void main(String[] args) {
                Scanner reader=new Scanner(System.in);

                checkLeapYear(Integer.parseInt(reader.nextLine()));
            }


    public static boolean isLeapYear(int year){
        return ((year%400==0) || (year%4==0 && year%100!=0));

    }
}

