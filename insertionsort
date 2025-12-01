package insertionsort;
import java.util.Arrays;

public class InsertionSort {

   
    public static void main(String[] args) {
        
        int[] list = {45,11,50,59,60,2,4,7,10};
        insertionSort(list);
        
        System.out.println(Arrays.toString(list));
        
    }
    public static void insertionSort(int[] list){
        
        for(int i=1; i<list.length; i++){
        int currentElement = list[i];
        int k;
        for(k = i-1;k>=0 && list[k]> currentElement;k--){
        list[k+1] = list[k];
        }
        list[k+1] = currentElement;
        }
    
    }

}
