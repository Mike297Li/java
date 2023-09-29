package main.java.com.example.demo;

public class BubleSort {
    void sort(int arr[])
    {
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j+1]<arr[j]){
              swap(arr,j,j+1);
            }
        }
    }
    }
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[])
    {
        int arr[] = {1, 3, 4,2,5,7,11};

        BubleSort ob = new BubleSort();
        ob.sort(arr);
        printArray(arr);
    }

    private static void swap(int[] arry, int i, int smallIndex) {
        int temp=arry[i];
        arry[i]=arry[smallIndex];
        arry[smallIndex]=temp;
    }
}
