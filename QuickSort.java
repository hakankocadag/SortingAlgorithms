package quicksort;
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] data = {8, 2, 5, 3, 9, 4, 7, 6, 1};
        System.out.println("Original Array: " + Arrays.toString(data));

        quickSort(data);

        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }

    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static void quickSort(int[] list, int low, int high) {
        if (high <= low) {
            return;
        }

        int pivotIndex = partition(list, low, high);
        quickSort(list, low, pivotIndex - 1);  
        quickSort(list, pivotIndex + 1, high);   
    }

    private static int partition(int[] list, int low, int high) {
        
        int pivot = list[high]; 
        int i = low - 1;        

        for (int j = low; j < high; j++) {
            
            if (list[j] < pivot) {
                i++; 
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        
        i++; 
        int temp = list[i];
        list[i] = list[high]; 
        list[high] = temp;     
        
        return i;
    }
}
