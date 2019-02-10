public class BinarySearch {

    public static void main(String[] args) {
        // Integer Input
        int[] numbs = {1, 2, 3, 4, 5, 6, 7};
        binarySearch(1, numbs, 0, 6);
    }

    public static boolean binarySearch(int v, int[] lst, int low, int high) {
        if (low > high) {
            System.out.println("not found");
            return false;
        }

        int median = (low+high)/2;

        if(v == lst[median]){
            System.out.println("found! It is at " + median);
            return true;
        } else if (v > lst[median]){
            return binarySearch(v, lst, median+1, high);
        } else {
            return binarySearch(v, lst, low, median-1);
        }
    }
}
