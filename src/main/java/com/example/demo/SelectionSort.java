package main.java.com.example.demo;

public class SelectionSort {

    public SelectionSort() {
    }

    public static void main(String[] args) {
        int count=0;
        int[] arry={3,2,6,4,1,8,9};
        //int[] arry={1,2,3,4,5,6,7};
        for(int i=0;i<arry.length-1;i++){
           int smallIndex=i;
           for(int j=i+1;j<arry.length;j++){
               if(arry[j]<arry[smallIndex]){
                   smallIndex=j;
               }
           }
           if(i!=smallIndex){
               swap(arry,i,smallIndex);
               count++;
           }
        }
        for(int i=0;i<arry.length-1;i++){
            System.out.println(arry[i]);
        }
       System.out.println("count===="+count);

    }

    private static void swap(int[] arry, int i, int smallIndex) {
        int temp=arry[i];
        arry[i]=arry[smallIndex];
        arry[smallIndex]=temp;
    }
}
