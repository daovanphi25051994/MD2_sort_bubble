public class BubbleSort {
    public void sort(int[] arrayNumbers) {
        boolean status = true;
        for (int i = 1; i < arrayNumbers.length && status; i++) {
            status = false;
            for (int j = 0; j < arrayNumbers.length - i; j++) {
                if (arrayNumbers[j] > arrayNumbers[j + 1]) {
                    int temp = arrayNumbers[j];
                    arrayNumbers[j] = arrayNumbers[j + 1];
                    arrayNumbers[j + 1] = temp;
                    status = true;
                }
            }
        }
    }

}
