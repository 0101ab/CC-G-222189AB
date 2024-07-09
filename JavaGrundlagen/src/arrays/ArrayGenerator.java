package arrays;

import java.util.Arrays;

public class ArrayGenerator {

    public static int[] fillEvenRandomArray() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) * 2; // Nur gerade Zahlen
        }
        return array;
    }

    public static int[] fillSortedRandomArray() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100); // Zufällige Zahlen
        }
        Arrays.sort(array); // Sortieren des Arrays
        return array;
    }

    public static void main(String[] args) {
        int[] evenRandomArray = fillEvenRandomArray();
        int[] sortedRandomArray = fillSortedRandomArray();

        System.out.println("Erstes Array (gerade Zufallszahlen): " + Arrays.toString(evenRandomArray));
        System.out.println("Zweites Array (aufwärts sortierte Zufallszahlen): " + Arrays.toString(sortedRandomArray));

        int sumEvenRandomArray = calculateSum(evenRandomArray);
        int sumSortedRandomArray = calculateSum(sortedRandomArray);

        System.out.println("Summe des ersten Arrays: " + sumEvenRandomArray);
        System.out.println("Summe des zweiten Arrays: " + sumSortedRandomArray);
    }

	private static int calculateSum(int[] evenRandomArray) {
		
		return 0;

           }
   
}
		

	
