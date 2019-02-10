import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        // Integer Input
        int[] numbs = {9, 5, 7, 3, 6, 2, 1};
        bubbleSort(numbs);
    }

    public static void bubbleSort(int[] lst) {
        int n = lst.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n-1; i++) {
                if (lst[i] > lst[i + 1]) {
                    swapped = true;
                    int temp = lst[i];
                    lst[i] = lst[i + 1];
                    lst[i + 1] = temp;
                }
            }
        } while(swapped);

        System.out.println(Arrays.toString(lst));
    }
}
