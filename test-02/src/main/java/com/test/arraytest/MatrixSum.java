package com.test.arraytest;

public class MatrixSum {
    public static void main(String[] args) {

        int rowsum=0;
        int columnsum=0;

        int [][] arr={{20, 19, 18},{17,16 ,15},{14, 13, 12}};


        for (int i = 0; i < arr.length; i++) {

            rowsum = 0;
            columnsum = 0;

            for (int j = 0; j < arr.length; j++) {
                rowsum += arr[i][j];
                columnsum += arr[j][i];
            }

            System.out.println("Row-" + (i + 1) + " sum = " + rowsum);
            System.out.println("Column-" + (i + 1) +
                    " sum = " + columnsum);
        }
    }
}
