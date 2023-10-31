package main.java.com.example.demo;

public class assignment1017 {
    public static void main(String[] args) {
        int[] array= {1,2,3,11};
        int specificVal=10;
        Boolean flag=false;
        for(int i=0;i<array.length;i++){
              if(array[i]==specificVal){
                  flag=true;
                  break;
              }
        }
        System.out.println("value "+specificVal+ (flag ? " was found in the array" :" was not found in the array"));
    }

}
