public class Task2 {
    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] result = countAndSumElements(input);

        if (result.length > 0) {
            System.out.println("Negative Number count: " + result[0] + ", Sum of positive numbers: " + result[1]);
        } else {
            System.out.println("Empty");
        }
    }

    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }

        int negativeCount = 0;
        int positiveSum = 0;

        for (int num : input) {
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveSum += num;
            }
        }

        return new int[]{negativeCount, positiveSum};
    }
}
