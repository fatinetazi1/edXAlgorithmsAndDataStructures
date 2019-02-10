import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        // Integer Input
        int[] numbs = {9, 5, 7, 3, 6, 2, 1};
        selectionSort(numbs);
    }

    public static void selectionSort(int[] lst) {
        // get the length
        int n = lst.length;

        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++){
                if(lst[j] < lst[min_index]){
                    min_index = j;
                }
            }
            int temp = lst[min_index];
            lst[min_index] = lst[i];
            lst[i] = temp;
        }
        System.out.println(Arrays.toString(lst));
    }
}
