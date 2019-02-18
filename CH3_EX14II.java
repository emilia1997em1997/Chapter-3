import java.util.Scanner;
//DateTest
public class CH3_EX14II {
    public static void main(String[] args) {
        CH3_EX14 display = new CH3_EX14();

        Scanner input = new Scanner (System.in);

        int month;
        int day;
        int year;

        System.out.print ("Enter Month: ");
        month = input.nextInt();
        display.setMonth(month);

        System.out.println ();

        System.out.print ("Enter Day: ");
        day = input.nextInt();
        display.setDay(day);

        System.out.println ();

        System.out.print ("Enter Year: ");
        year = input.nextInt();
        display.setYear(year);

        System.out.println ();

        display.displayDate();

    }
}