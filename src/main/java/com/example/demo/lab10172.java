package main.java.com.example.demo;

import java.util.Scanner;

public class lab10172 {
    public static void main(String[] args) {
        int[] array=new int[2];
        for(int i=0;i<2;i++){
            Scanner scannerPhysics=new Scanner(System.in);
            System.out.println("Please input physics score");
            int scorePhysics=scannerPhysics.nextInt();
            Scanner scannerChemistry=new Scanner(System.in);
            System.out.println("Please input Chemistry score");
            int scoreChemistry=scannerChemistry.nextInt();
            Scanner scannerMaths=new Scanner(System.in);
            System.out.println("Please input Maths score");
            int scoreMaths=scannerMaths.nextInt();
            array[i]=(scorePhysics+scoreChemistry+scoreMaths)/3;
        }
        int moreThan80NUm=0;
        int lessThan30Num=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>=80){
                moreThan80NUm++;
            }
            if(array[i]<=30){
                lessThan30Num++;
            }
        }
        System.out.println("number of student got 80% and above "+moreThan80NUm+" number of student got 30% and less "+lessThan30Num);
    }

}
