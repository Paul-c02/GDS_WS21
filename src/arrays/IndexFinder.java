package arrays;

public class IndexFinder {

    public static int findIndexForNumber(int[] numbers, int searchNumber) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==searchNumber)return i;
        }
return -1;
    }

    public static int[] findIndicesForExpectedSum(int[] numbers, int expectedSum) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        for (int i = 0; i < numbers.length; i++)
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[i] + numbers[j] == expectedSum) {
                    result[0] = i;
                    result[1] = j;
                }
        return result;
    }
}
