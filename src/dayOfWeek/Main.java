package dayOfWeek;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner prompt = new Scanner(System.in);

        try{
            System.out.println("Enter a day of the week >> ");
            String value = prompt.nextLine().toUpperCase();

            Day day= Day.valueOf(value);
            switch(day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday!!!");
                case SATURDAY, SUNDAY -> System.out.println("It is a weekend!!!");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid day of the week");
        }

    }

}
