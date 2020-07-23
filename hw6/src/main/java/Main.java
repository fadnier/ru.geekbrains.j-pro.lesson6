import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ///
        int[] test = {1,1,4};
        System.out.println(arrayOnlyOneFour(test));
    }

    public static int[] arrayFindFour(int[] myArray) {
        final int SELECTED = 4;
        int lastIndex = -1;
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i]==SELECTED) lastIndex = i+1;
        }
        if(lastIndex== -1) {
            throw new RuntimeException("Four not fund");
        }
        return Arrays.copyOfRange(myArray,lastIndex,myArray.length);
    }

    public static boolean arrayOnlyOneFour(int[] myArray) {
        final int SELECTED1 = 1;
        final int SELECTED2 = 4;
        boolean checkTrigger1 = false;
        boolean checkTrigger2 = false;
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i]!=SELECTED1 && myArray[i]!=SELECTED2) {
                return false;
            }
            if(myArray[i]==SELECTED1) {
                checkTrigger1 = true;
            }
            if(myArray[i]==SELECTED2) {
                checkTrigger2 = true;
            }
        }
        if(checkTrigger1==true && checkTrigger2==true) {
            return true;
        }
        return false;
    }
}
