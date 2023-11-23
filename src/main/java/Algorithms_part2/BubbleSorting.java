package Algorithms_part2;

public class BubbleSorting {

    public static void main(String[] args){
        int[] array = new int[] {
            9, 8, 7, 6, 5, 4, 3, 2, 1, 0
        } ;

        bubbleSort(array);

        for (int i =0; i < array.length; ++i){
            System.out.print(array[i] + " ");
        }


    }

    public static void bubbleSort(int[] array) {
        boolean finish = true;
        int counter = 0;
        do {
            finish = true;

            for (int i = 0; i < array.length - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                    ++counter;
                }
            }
        }while (!finish);
        System.out.println(counter);
    }
}