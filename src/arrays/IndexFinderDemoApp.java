package arrays;

public class IndexFinderDemoApp {
    public static void main(String[] args) {
        int[] testArray = {0,1,9,7};

        System.out.println(IndexFinder.findIndexForNumber(testArray, 7));
        System.out.println(IndexFinder.findIndexForNumber(testArray, 2));
        for (int number : IndexFinder.findIndicesForExpectedSum(testArray, 8)) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : IndexFinder.findIndicesForExpectedSum(testArray, 5)) {
            System.out.print(number + " ");
        }
    }
}
