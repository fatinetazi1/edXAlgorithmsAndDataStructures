import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        // Integer Input
        int[] numbs = {9, 5, 7, 3, 6, 2, 1};
        quickSort(numbs, 0, 6);
        System.out.println(Arrays.toString(numbs));
    }

    public static void quickSort(int[] lst, int left, int right) {
        if (left < right) {
            int partition_index = partition(lst, left, right);

            quickSort(lst, left, partition_index - 1);
            quickSort(lst, partition_index + 1, right);
        }
    }

    public static int partition(int[] lst, int left, int right){
        int pivot = lst[right];
        int index = left - 1;

        for(int i = left; i < right; i++){
            if (lst[i] <= pivot){
                index ++;

                int temp = lst[index];
                lst[index] = lst[i];
                lst[i] = temp;
            }
        }

        int temp = lst[index+1];
        lst[index+1] = lst[right];
        lst[right] = temp;

        return index+1;
    }
}
