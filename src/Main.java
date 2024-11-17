import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverseArray(9)));
        System.out.println(Arrays.toString(reverseArray(6)));
        System.out.println(Arrays.toString(reverseArray(5)));
        System.out.println(Arrays.toString(reverseArray(3)));


    }


    public static int[] reverseArray(int arrayLength) {

        int[] array = randomArray(arrayLength);
        Arrays.sort(array);

        int lengthOfArray = array.length;
        int[] descendingArray = new int[lengthOfArray];

        for(int i = 0; i < array.length; i ++) {
            descendingArray[i] = array[lengthOfArray - 1];
            lengthOfArray -= 1;
        }
        return descendingArray;

    }

    public static int[] randomArray(int length) {
        // Instantiating our random object.
        Random random = new Random();
        int[] randomArray = new int[length];
        // creates a random array with integers between 0 & 99
        for(int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt(100);
        }
        return randomArray;
    }



}
