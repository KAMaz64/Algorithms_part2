package Algorithms_part2;

public class DirectSorting {

    public static void main(String[] args) {
        int[] array = new int[]{
                0, 8, 7, 5, 6, 4, 3, 2, 1, 9
        };

        directSort(array);

        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }

    public static void directSort (int[] array){
        int counter = 0;
        for (int i = 0; i < array.length -1; ++i){
            int minPosition = i;
            for (int j = i+1; j < array.length; ++j, ++counter) {
                if (array[j] < array[minPosition]){
                    minPosition = j;
                }
            }
            if (i != minPosition){
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
        System.out.println(counter);
    }
}
