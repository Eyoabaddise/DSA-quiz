import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sequence of numbers
        System.out.print("Enter a sequence of numbers separated by spaces: ");
        String sequence = scanner.nextLine();
        String[] numbers = sequence.split(" ");
        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        // Input number to be searched
        System.out.print("Enter a number to be searched: ");
        int num = scanner.nextInt();

        // Count occurrences of the number
        int occurrences = countOccurrences(arr, num);

        // Display the result
        if (occurrences > 0) {
            System.out.printf("The number %d appears %d times in the sequence.\n", num, occurrences);
        } else {
            System.out.printf("The number %d is not present in the sequence.\n", num);
        }
    }

    public static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }
        return count;
    }
}
