public class BinarySearch {

    public static int binarySearch(int[] array, int low, int high, int data) {
        int mid = 0;
        if (high >= low) {
            mid = (high + low) / 2;
            if (data == array[mid]) {
                return mid;
            } else if (data > array[mid]) {
                return binarySearch(array, mid + 1, high, data);
            } else {
                return binarySearch(array, low, high - 1, data);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[50];
        int number;

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            number = (int) Math.floor(Math.random() * 50);
            array[i] = number;
        }

        for (int arr : array) {
            System.out.print(arr + " ");
        }

        int value = BinarySearch.binarySearch(array, 0, array.length - 1, 0);
        long endTime = System.currentTimeMillis();
        System.out.println("\nChỉ số 31 là: " + value);
        System.out.println("Thời gian thực hiện: " + (endTime - startTime) + " miliseconds");
    }
}

