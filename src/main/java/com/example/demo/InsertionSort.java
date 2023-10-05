package main.java.com.example.demo;
public class InsertionSort {
    void sort(int arr[])
    {
     for(int pointer=1;pointer<arr.length;pointer++){
         int position=pointer;
         int currentVal=arr[pointer];
         while(position>0 && arr[position-1]>currentVal){
             arr[position]=arr[position-1];
             position--;
         }
         arr[position]=currentVal;
     }
    }
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[])
    {
        int arr[] = {15, 2,3,8, 11, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
    }
};