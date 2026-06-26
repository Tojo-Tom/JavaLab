public class CountNumbers {

    public static void countElements(int[] arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive = " + positiveCount);
        System.out.println("Negative = " + negativeCount);
        System.out.println("Zero = " + zeroCount);
    }

    public static void main(String[] args) {
        int[] arr = {1, -3, 2, 0, -2, 2};
        countElements(arr);
    }
}