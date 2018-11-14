package com.company;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner kbInput = new Scanner(new File("scores.txt"));
        int maxIndex = -1;
        String text[] = new String[1000];

        //This prints out every line in the scores file

        while(kbInput.hasNext()){
            maxIndex++;
            text[maxIndex] = kbInput.nextLine();
        }

        kbInput.close();
        //Prints out the schools

        /*
        String output[] = text[3].split("\t");

        //Make them NOT STRINGS
        int num1, num2, num3;
        num1 = Integer.parseInt(output[18]);
        num2 = Integer.parseInt(output[19]);
        num3 = Integer.parseInt(output[20]);

        double average = (num1+num2+num3)/3;


        System.out.println(average);
        */

        String output[];
        for(int i = 3; i < text.length; i++){
            output = text[i].split("\t");
            if(output.length > 18){
                int num1, num2, num3;
                num1 = Integer.parseInt(output[18]);
                num2 = Integer.parseInt(output[19]);
                num3 = Integer.parseInt(output[20]);
                int average = (num1 + num2 + num3) / 3;
                System.out.println(average);
            }

        }

        //not the output length but the tab
    }
}
