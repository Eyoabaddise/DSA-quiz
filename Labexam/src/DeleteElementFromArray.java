
    public class DeleteElementFromArray {
        public static void main(String[] args) {
            int[] array = {3, 7, 1};
            int indexToDelete = 2;

            System.out.println("Original array:");
            printArray(array);

            array = deleteElement(array, indexToDelete);

            if (array != null) {
                System.out.println("\nArray after deleting element at index " + indexToDelete + ":");
                printArray(array);
            }
        }

        public static int[] deleteElement(int[] arr, int index) {
            if (index < 0 || index >= arr.length) {
                System.out.println("Invalid index.");
                return arr;
            }

            int[] newArray = new int[arr.length - 1];
            int newIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i != index) {
                    newArray[newIndex] = arr[i];
                    newIndex++;
                }
            }
            return newArray;
        }

        public static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }


