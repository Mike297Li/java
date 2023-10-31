package main.java.com.example.demo;

import java.util.Scanner;

public class lab10173 {
    public static void main(String[] args) {
        int[] arrayP=new int[6];
        int[] arrayQ=new int[4];
        int[] arrayR=new int[10];
        for(int i=0;i<6;i++){
            arrayP[i]=i+1;
            arrayR[i]=i+1;
        }
        for(int i=0;i<4;i++){
            arrayQ[i]=i+7;
            arrayR[i+6]=i+7;
        }
    }

}
