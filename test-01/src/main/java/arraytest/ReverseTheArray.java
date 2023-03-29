package arraytest;

public class ReverseTheArray {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40};
        reverse(arr);
    }
    private static void reverse(int[]arr){
        for(int j=arr.length-1;j>=0;j--){
            System.out.println(arr[j]);
        }
    }
        }

