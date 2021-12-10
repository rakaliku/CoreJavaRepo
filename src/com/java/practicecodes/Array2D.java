package com.java.practicecodes;

public class Array2D {
    public static void main(String[] args)
    {
        int[][] arr={{10,20,30},{40,50,60}};

        System.out.println("length of row in the array-"+arr.length);
        System.out.println("length of column in the array-"+arr[0].length);
        for (int i = 0;i<arr.length;i++)//here i is row
        {
            for (int j=0;j<arr[0].length;j++)// here j is column
            {
                System.out.println(arr[i][j]);
            }

        }
    }
}
