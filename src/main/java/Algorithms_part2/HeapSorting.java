package Algorithms_part2;

public class HeapSorting {

    public static void main(String[] args){
        int [] array = new int[]{
                2,5,8,23,67,45,27,15,9,8,11,23, 18
        };

        heapSort(array);

        for (int i =0; i < array.length; ++i){
            System.out.print(array[i] + " ");
        }
    }

    // Основная функция сортировки кучей
    public static void heapSort(int arr[]) {
        int n = arr.length;

        // Построение кучи (перегруппировка массива)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Один за другим извлекаем элементы из кучи
        for (int i = n - 1; i > 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    // Функция для преобразования массива в кучу с корнем i
    private static void heapify(int arr[], int n, int i) {
        int largest = i; // Инициализация наибольшего элемента как корня
        int leftChild = 2 * i + 1; // Левый дочерний элемент
        int rightChild = 2 * i + 2; // Правый дочерний элемент

        // Если левый дочерний элемент больше корня
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        // Если правый дочерний элемент больше, чем наибольший элемент на данный момент
        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // Если наибольший элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно вызываем heapify для поддерева
            heapify(arr, n, largest);
        }
    }

    // Вспомогательная функция для вывода массива на экран
/*    private static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }*/

}
