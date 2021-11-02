package com.anthony.RoShamBo;

import java.util.Locale;
import java.util.Scanner;

public class RoShamBo {
    public static void rps() {
        System.out.println("Let's play Rock, Paper, Scissors!");
        Scanner input = new Scanner(System.in);
        System.out.println("Player One Input:");
        String p1Input = input.next();
        System.out.println("Player Two Input:");
        String p2Input = input.next();

        p1Input.toLowerCase();
        p2Input.toLowerCase();

        switch (p1Input) {
            case "rock": {
                if (p2Input.equals("rock")) {
                    System.out.println("Draw.");
                    break;
                }
                else if (p2Input.equals("paper")) {
                    System.out.println("Player Two Wins!");
                    break;
                }
                else if (p2Input.equals("scissors")) {
                    System.out.println("Player One Wins!");
                    break;
                }
                else {
                    System.out.println("Error, invalid input. Please input 'Rock', 'Paper', or 'Scissors'.");
                    break;
                }

            }
            case "paper": {
                if (p2Input.equals("rock")) {
                    System.out.println("Player One Wins!");
                    break;

                }
                else if (p2Input.equals("paper")) {
                    System.out.println("Draw");
                    break;


                }
                else if (p2Input.equals("scissors")) {
                    System.out.println("Player Two Wins!");
                    break;

                }
                else {
                    System.out.println("Error, invalid input. Please input 'Rock', 'Paper', or 'Scissors'.");
                    break;
                }

            }
            case "scissors": {
                if (p2Input.equals("rock")) {
                    System.out.println("Player Two Wins");
                    break;


                }
                else if (p2Input.equals("paper")) {
                    System.out.println("Player Two Wins!");
                    break;


                }
                else if (p2Input.equals("scissors")) {
                    System.out.println("Player Two Wins!");
                    break;


                }
                else {
                    System.out.println("Error, invalid input. Please input 'Rock', 'Paper', or 'Scissors'.");
                    break;

                }

            }
            default: {
                System.out.println("Error, invalid input. Please input 'Rock', 'Paper', or 'Scissors'.");
                break;
            }
        }

    }
}
