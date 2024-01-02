package main.java.com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Class5 {
    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new FileReader("/Users/lifuchun/Desktop/export.sql"))) {
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
        }catch (Exception e){

        }
    }


}
