package twelveDaysOfChristmas;
import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        for(int count = 1; count <= 12; count++) {
            switch(count) {
                case 1 -> {
                    print("\nOn the First Day of christmas my true love sent to me!\n");
                    remainingVerses(count);
                }
                case 2 -> {
                    print("\nOn the second day of Christmas my true love sent to me\n");
                    remainingVerses(count);
                }


                case 3 -> {
                    print("\nOn the third day of Christmas my true love sent to me\n");
                    remainingVerses(count);
                }

                case 4 -> {
                    print("\nOn the Fourth day of Christmas my true love sent to me\n");
                    remainingVerses(count);
                }

                case 5 -> {
                    print("\nOn the Fifth day of Christmas my true love sent to me\n");
                    remainingVerses(count);
                }

                case 6 -> {
                    print("\nOn the Sixth day of Christmas my true love sent to me\n");
                    remainingVerses(count);
                }

                case 7 -> {
                    print("\nOn the Seventh day of Christmas my true love sent to me\n");
                    remainingVerses(count);
                }

                case 8 -> {
                    print("\nOn the Eighth day of Christmas my true love sent to me\n");
                    remainingVerses(count);
                }

                case 9 -> {
                    print("\nOn the Nineth day of Christmas my true love sent to me\n");
                    remainingVerses(count);
                }

                case 10 -> {
                    print("\nOn the Tenth day of Christmas my true love sent to me\n");
                    remainingVerses(count);
                }

                case 11 -> {
                    print("\nOn the Eleventh day of Christmas my true love sent to me\n");
                    remainingVerses(count);
                }

                case 12 -> {
                    print("\nOn the Twelfth day of Christmas my true love sent to me\n");
                    remainingVerses(count);
                }


            }
        }
    }

    private static void remainingVerses(int count) {
        switch (count) {
            case 12: print("twelve drummers drumming");
            case 11: print("eleven pipers piping");
            case 10: print("ten lords a-leaping");
            case 9: print("nine ladies dancing");
            case 8: print("eight maids a-milking");
            case 7: print("seven swans a-swimming");
            case 6: print("six geese a-laying");
            case 5: print("five gold rings");
            case 4: print("Four Colly birds");
            case 3: print("Three French hens");
            case 2: print("Two Turtle doves");
            case 1: print("And a patridge in a pear tree!");

        }
    }

    private static String input(String message){
        print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void print(String message) {
         System.out.println(message);
    }
}
