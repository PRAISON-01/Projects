package MiniTask;

import java.util.ArrayList;

public class NumberBaseConverter {

    public static String getBaseConversion(int numberToConvert, int currentBase, int desiredBase) {
        
        String stringBuilder = "";
        if(numberToConvert == 0) {
            stringBuilder = "0";
            return stringBuilder;
        }

        int numberInBaseTen = numberToConvert;
        if(currentBase != 10) {
            numberInBaseTen = toBaseTen(numberToConvert, currentBase);
            if(desiredBase == 10) {
                return String.valueOf(numberInBaseTen);
            }
        }
        if(desiredBase != 10) {
            while(numberInBaseTen > 0) {
                int remainder = (numberInBaseTen % desiredBase);
                stringBuilder = remainder + stringBuilder;
                numberInBaseTen = (numberInBaseTen / desiredBase);

            }

        }


//        int arraylength = numbers.size();
//        int[] newArray = new int[arraylength];
//        for(int count = newArray.length -1 ; count > 0 ; count--) {
//            newArray[count] = numbers.get(count);
//        }


        return stringBuilder;
    }

    private static int toBaseTen(int numberToConvert, int currentBase) {
        int total = 0;
        String numberToString = numberToConvert + "";
        for(int count = 0; count < numberToString.length(); count++) {
            int remainder = numberToConvert % 10;
            total += (int)(remainder * Math.pow(currentBase, count));
            numberToConvert = (int)Math.floor(((double) numberToConvert / 10));
        }
        return total;
    }
}
