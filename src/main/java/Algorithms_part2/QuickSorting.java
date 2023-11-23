package Algorithms_part2;

public class QuickSorting {

    public static void main(String[] args){
        int [] array = new int[]{
                2,5,8,23,67,45,27,15,9,8,11,23, 18
        };

        quickSort(array);

        for (int i =0; i < array.length; ++i){
            System.out.print(array[i] + " ");
        }
    }

    // Основная функция для вызова сортировки
    public static void quickSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int length = array.length;
        quickSort(array, 0, length - 1);
    }

    // Рекурсивная функция быстрой сортировки
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Находим индекс опорного элемента, который находится на своем месте в отсортированном массиве
            int partitionIndex = partition(array, low, high);

            // Рекурсивно сортируем элементы до и после опорного элемента
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Функция для разделения массива и возврата индекса опорного элемента
    private static int partition(int[] array, int low, int high) {
        // Используем последний элемент в качестве опорного
        int pivot = array[high];

        // Индекс меньшего элемента
        int i = low - 1;

        // Проходим по массиву
        for (int j = low; j < high; j++) {
            // Если текущий элемент меньше или равен опорному
            if (array[j] <= pivot) {
                // Увеличиваем индекс меньшего элемента
                i++;

                // Меняем местами элементы в массиве
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Помещаем опорный элемент на свое место
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Возвращаем индекс опорного элемента
        return i + 1;
    }
}
