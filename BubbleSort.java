package bubblesort;
import java.util.Arrays;

public class BubbleSort {

   
    public static void main(String[] args) {
        
        int[] list = { 64, 34, 25, 12, 22, 11, 90 };
      
        // The Outer Loop ('k' starting at 1)
        for (int k = 1; k < list.length; k++) {
            
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];      // 1. Save list[i] in a temporary cup
                    list[i] = list[i + 1];   // 2. Overwrite list[i] with list[i+1]
                    list[i + 1] = temp;      // 3. Put the saved value into list[i+1]
                }
            }
        }
        System.out.println(Arrays.toString(list));        
    }
}
