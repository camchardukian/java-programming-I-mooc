
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = { -1, 3, 1, 2 };
        indexOfSmallestFrom(array, 1);

    }

    public static int smallest(int[] array) {
        int smallestNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestNum) {
                smallestNum = array[i];
            }
        }
        return smallestNum;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestNum = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestNum) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int[] clonedPartialArray = new int[table.length - startIndex];
        System.arraycopy(table, startIndex, clonedPartialArray, 0, table.length - startIndex);
        return indexOfSmallest(clonedPartialArray) + startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int value1 = array[index1];
        array[index1] = array[index2];
        array[index2] = value1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int num : array) {
                System.out.println(num);
            }
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, i, smallest);
        }
    }

}
