package main.java.com.example.demo;

import java.util.Scanner;

public class lab10175 {
    public static void main(String[] args) {
        int[] arrayEnglish=new int[2];
        int[] arrayScience=new int[2];
        int[] arrayMaths=new int[2];
        int[] arrayAverage=new int[2];
        for(int i=0;i<2;i++){
            Scanner scannerEnglish=new Scanner(System.in);
            System.out.println("Please input english score");
            arrayEnglish[i]=scannerEnglish.nextInt();
            Scanner scannerScience=new Scanner(System.in);
            System.out.println("Please input science score");
            arrayScience[i]=scannerScience.nextInt();
            Scanner scannerMaths=new Scanner(System.in);
            System.out.println("Please input Maths score");
            arrayMaths[i]=scannerMaths.nextInt();
            arrayAverage[i]=(arrayEnglish[i]+arrayScience[i]+arrayMaths[i])/3;
        }

        int sum=0;
        for(int i=0;i<arrayEnglish.length;i++){
           sum+=arrayEnglish[i];
        }
        sum=0;
        System.out.println("average score of arrayEnglish "+sum/arrayEnglish.length);
        for(int i=0;i<arrayScience.length;i++){
            sum+=arrayScience[i];
        }
        sum=0;
        System.out.println("average score of arrayScience "+sum/arrayScience.length);
        for(int i=0;i<arrayMaths.length;i++){
            sum+=arrayMaths[i];
        }
        System.out.println("average score of arrayMaths "+sum/arrayMaths.length);
    }

}
