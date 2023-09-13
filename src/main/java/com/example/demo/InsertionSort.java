package main.java.com.example.demo;
public class InsertionSort {
    void sort(int arr[])
    {
       for(int a=0;a<arr.length;a++){
           int currentVal=arr[a];
           int b=a-1;
           while(b>=0 && arr[b]>currentVal){
               arr[b+1]=arr[b];
               b--;
           }
           arr[b+1]=currentVal;
       }
    }
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[])
    {
        int arr[] = {3, 11, 1, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
    }
};