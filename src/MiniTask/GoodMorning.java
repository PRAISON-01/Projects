package MiniTask;

public class GoodMorning {
    public static int[] oddSumSwap(int[] array) {
        for(int count = 0; count < array.length - 1; count+= 2) {
                if((array[count] + array[count + 1]) % 2 != 0) {
                    int temp = array[count];
                    array[count] = array[count + 1];
                    array[count + 1] = temp;
                }
        }
        return array;
    }
}
