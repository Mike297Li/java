package main.java.com.example.demo;

public class assignment10172 {
    public static void main(String[] args) {
        int[] array={1,2,3,45,6};
        int max=array[0];
        int min=array[0];
        for(int i=0;i<array.length;i++){
              if(array[i]>max){
                  max=array[i];
              }
              if(array[i]<min){
                  min=array[i];
              }
        }
        System.out.println("Max value is "+max+" and min value is "+min);
    }

}
