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
    int countOfLines = 0;
        while (kbInput.hasNext()) {
            maxIndex++;
            text[maxIndex] = kbInput.nextLine();
            countOfLines++;
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
        school schools [] = new school [text.length];
        for (int i = 1; i < countOfLines; i++) {
            output = text[i].split("\t");
            int num1 = 0, num2, num3;
            if (output.length > 21 && !output[18].equals("")) {
                num1 = Integer.parseInt(output[18]);
                num2 = Integer.parseInt(output[19]);
                num3 = Integer.parseInt(output[20]);
                double average = (double)(num1 + num2 + num3) / 3.0;
                schools [i] = new school(output[1], average);
                System.out.println(output[1]+ ": " + average);

            }


        }








//
    }
}

