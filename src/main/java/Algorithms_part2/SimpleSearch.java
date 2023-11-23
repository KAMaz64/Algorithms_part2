package Algorithms_part2;

public class SimpleSearch {

    public static void main (String[] args){
        int[] array = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        System.out.println(find(array, 7));
    }

    public static int find(int[] array, int value){
        for (int i = 0; i< array.length; ++i){
            if (array[i] == value){
                return i;
            }

        }
        return -1;
    }
}
