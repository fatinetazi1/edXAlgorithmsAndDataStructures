public class LinearSearch {

    public static void main(String[] args) {
        // Integer Input
        int[] numbs = {9, 5, 7, 3, 6, 2, 1};
        linearSearch(numbs, 1);
    }

    public static void linearSearch(int[] lst, int v) {
        int n = lst.length;
        for (int i = 0; i < n; i++) {
            if (lst[i] == v) {
                System.out.println("found! It is at " + i);
                return;
            }
        }
        System.out.println("the element is not in the array");
        return;
    }
}
