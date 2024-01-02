package main.java.com.example.demo;
import java.util.Scanner;

public class assignment5ForWeek10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the size of array");
        int size = scanner.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("please enter the "+i+"th element");
            array[i] = scanner.nextInt();
        }
        System.out.print("original array is ===");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        // arrange the elements in descending order
        sort(array);
        System.out.print("descending order array is ===");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }

    /**
     * insert sort(descending order)
     * @param arr
     */
    static void sort(int arr[])
    {
        for(int pointer=1;pointer<arr.length;pointer++){
            int position=pointer;
            int currentVal=arr[pointer];
            while(position>0 && arr[position-1]<currentVal){
                arr[position]=arr[position-1];
                position--;
            }
            arr[position]=currentVal;
        }
    }
}
