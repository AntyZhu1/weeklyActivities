package com.anthony;

import com.anthony.RoShamBo.*;
import com.anthony.PigLatin.*;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Boolean done = false;

        while (!done) {
//            System.out.println(" ");

            System.out.println("Wanna use Pig Latin, or play Rock Paper Scissors?");
            System.out.println("enter 1 for Pig Latin, enter 2 for RPS, 0 to quit");


            try {
                int userIn = Integer.parseInt(input.nextLine());
                System.err.println("User Input " + userIn);


                if (userIn == 1) {


                    System.out.println("Enter the phrase you want translated:");
                    String phrase = input.nextLine();
//                    System.err.println(phrase);

                    PigLatin.pigLatin(phrase);

                }

                else if (userIn == 2) {


                    RoShamBo.rps();
                    System.out.println("");

                }

                else if (userIn == 0){
                    done = true;
                    System.out.println("Quitting...");
                    input.close();

                }

                else {
                    System.out.println("Error, invalid number! Please enter 1, 2, or 0!");
                    System.out.println("");
                }

            }catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error, invalid input. please input a number!");
                System.out.println("Quitting...");
                input.close();
                done = true;
            }

        }



    }
}
