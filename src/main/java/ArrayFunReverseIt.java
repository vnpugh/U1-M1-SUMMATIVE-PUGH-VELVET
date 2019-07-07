import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunReverseIt {
    //main method
    public static void main(String[] args) {
        //declaring the array
        int[] newArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(newArray));

        //reversing the array
        for (int i = 0; i < newArray.length / 2; i++) {
            int inputArray = newArray[i];

            newArray[i] = newArray[newArray.length - 1 - i];

            newArray[newArray.length - 1 - i] = inputArray;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
