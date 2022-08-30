package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ELCOT\\Desktop\\Sruthirrandom.csv"));
        String line =" ";
        int i;
        while((line=br.readLine())!=null)
        {
            String [] s = line.split(",");
            for(i=0;i<6;i++)
                System.out.print(s[i]+" ");
            System.out.println(" ");
        }
    }
}
