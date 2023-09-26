package main.java.com.example.demo;

import java.util.Scanner;

public class assignment5 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("please Enter Internet monthly traffic in megabytes");
        String traffic=obj.nextLine();
        System.out.println("monthly bill for "+traffic+"MB traffic is $"+getBill(Integer.parseInt(traffic)));
    }

//    caculate bill base on different condition
    private static double getBill(Integer traffic) {
        double bill=0.0;
        if(traffic>=5000){
            bill=0.1*traffic;
        }else if(traffic>=2000 && traffic<=4999){
            bill=0.015*traffic;
        }else if(traffic>=1000 && traffic<=1999){
            bill=0.02*traffic;
        }else {
            bill=0.025*traffic;
        }
        return bill;
    }

}
