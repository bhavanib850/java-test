package arraytest;

public class Testarray2 {
    //creating a method which receives an array as a parameter
    static void min(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (max < arr[i])
                max = arr[i];

        System.out.println(max);
    }

    public static void main(String args[]) {
        int a[] = {33, 3, 4, 5,89};//declaring and initializing an array
        min(a);//passing array to method
    }
}


