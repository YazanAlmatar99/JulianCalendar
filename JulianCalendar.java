//  http://www.yazanalmatar.com
import java.lang.*;
/**
 * Generates a non-leap year perpetual Julian Calendar
 * @author lji
 *
 */
public class JulianCalendar {

    // Max number of Days in a month
    static private  final int MAX_DAY = 31;

    // abbreviated Month names
    static private  final String [] MONTH_NAMES = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    // day length of each month
    static private final  int [] MONTH_SIZES = {
            31, 28, 31,30,31, 30, 31, 31, 30, 31, 30, 31
    };

    /**
     * display The "DAY" Column Heading
     */
    static private void displayDayHeading() {
        System.out.printf("%6s", "Day");

    }

    /**
     * display Month names between Day .... Day
     */
    static private void displayHeading() {
        displayDayHeading();

        for(int i = 0 ; i < MONTH_NAMES.length ; ++i )  {
            System.out.printf("%5s", MONTH_NAMES[i]);
        }

        displayDayHeading();
    }


    static public void display() {
        displayHeading(); // display heading

//		//dynamically get the biggest month days
        int biggestNumber = 0;
        for (int i = 0 ; i < MONTH_SIZES.length - 1 ; i++) {
            biggestNumber = MONTH_SIZES[i];
            if (biggestNumber < MONTH_SIZES[i + 1]) {
                biggestNumber = MONTH_SIZES[i + 1];
            }
        }

        for (int i = 0; i < MONTH_NAMES.length; i ++) {
            for (int j = 0; i < biggestNumber; j ++) {
                System.out.format("%32",biggestNumber);
            }
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // invoke display method
        display();
    }
}