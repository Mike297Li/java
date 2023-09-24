package main.java.com.example.demo;
public class InsertionSort {
    void sort(int arr[])
    {
        for(int pointer=1;pointer<arr.length;pointer++){
            int currentVal=arr[pointer];
            int postion=pointer;
            while(postion>0 && arr[postion-1]>currentVal){
                arr[postion]=arr[postion-1];
                postion--;
            }
            arr[postion]=currentVal;
        }
    }
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[])
    {
        int arr[] = {3, 2,8,11, 1, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
    }
};