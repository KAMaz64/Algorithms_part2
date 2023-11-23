package Algorithms_part2;

public class InsertionSorting {

    public static void main(String[] args) {
        int[] array = new int[]{
                0, 8, 7, 5, 6, 4, 3, 2, 1, 9
        };

        insertionSort(array);

        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    } 

    public static void insertionSort (int[] array){
        int counter = 0;
        for (int i = 0; i < array.length -1; ++i){
            for (int j = i+1; j < array.length; ++j, ++counter) {
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(counter);
    }
}
