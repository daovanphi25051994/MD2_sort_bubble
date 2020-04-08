public class Main {
    public static void main(String[] args) {
        int[] arrayNumber = {10, 22, 15, 7, 9, 66, 44, 88, 11, 34, 745, 95, 52, 41};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arrayNumber);
        for (int x : arrayNumber) {
            System.out.println(x);
        }
    }
}
