package arraytest;

public class PairSumEqualToN {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 5, 9, 3};
        PairSumEqualToN(arr, 10);
    }

    public static void PairSumEqualToN(int arr[], int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }

    }
}


