package com.company;

/*
The program enters the name of the month from the keyboard and displays its number on the screen in the form: "May is 5 month".
Use collections.

Requirements:
1. The program should display the text on the screen.
2. The program should read the values from the keyboard.
3. The Solution class must contain one method.
4. The program should use collections.
5. The program should read the name of the month from the keyboard and display its number on the screen according to the specified pattern.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String monthInput = reader.readLine();
        ArrayList<String> months = new ArrayList<>();

        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        int x = -1;
        for (String month : months){
            x++;
            if (monthInput.equals(month)){
                System.out.println(month + " is " + (x + 1) + " month");
            }
        }
    }
}






