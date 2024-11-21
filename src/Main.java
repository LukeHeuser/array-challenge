import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverseRandomArray(9)));
        System.out.println(Arrays.toString(reverseRandomArray(6)));
        System.out.println(Arrays.toString(reverseRandomArray(5)));
        System.out.println(Arrays.toString(reverseRandomArray(3)));

        System.out.println(Arrays.toString(getIntegers(5)));
        
    }

    public static int[] reverseRandomArray(int arrayLength) {

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

    public static int[] reverseArray(int[] array) {

        Arrays.sort(array);
        int lengthOfArray = array.length;
        int[] descendingArray = new int[lengthOfArray];

        for(int i = 0; i < array.length; i ++) {
            descendingArray[i] = array[lengthOfArray - 1];
            lengthOfArray -= 1;
        }
        return descendingArray;
    }

    public static int[] getIntegers(int arrayLength) {

        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[arrayLength];
        int validInt;

        System.out.printf("You have selected to create your own integer with a length of %d!%n"
                , arrayLength);
        for(int i = 0; i < arrayLength; i++) {
            System.out.println("Enter an integer for an Array!");
            String nextInt = scanner.nextLine();
            validInt = Integer.parseInt(nextInt);
            intArray[i] = validInt;

        }
        System.out.println(Arrays.toString(intArray));
        return reverseArray(intArray);

    }



}