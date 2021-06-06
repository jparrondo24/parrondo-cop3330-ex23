/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String isSilent = in.nextLine().toLowerCase();
        if (isSilent.equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            String terminalsAreCorroded = in.nextLine().toLowerCase();
            if (terminalsAreCorroded.equals("y")) {
                System.out.println("Clean terminals and try starting again.");
            } else if (terminalsAreCorroded.equals("n")){
                System.out.println("The battery cables may be damaged.");
                System.out.println("Replace cables and try again.");
            }
        } else if (isSilent.equals("n")) {
            System.out.print("Does the car make a clicking noise? ");
            String doesMakeClickingNoise = in.nextLine().toLowerCase();
            if (doesMakeClickingNoise.equals("y")) {
                System.out.println("The battery may be low or damaged");
                System.out.println("Replace the battery.");
                return;
            } else if (!doesMakeClickingNoise.equals("n")) {
                return;
            }

            System.out.print("Does the car crank up but fail to start? ");
            String doesCarFail = in.nextLine().toLowerCase();
            if (doesCarFail.equals("y")) {
                System.out.println("The spark plug may not be properly connected.");
                System.out.println("Check spark plug connections.");
                return;
            } else if (!doesCarFail.equals("n")) {
                return;
            }

            System.out.print("Does the engine start and then die? ");
            String doesEngineDie = in.nextLine().toLowerCase();
            if (doesEngineDie.equals("n")) {
                System.out.println("This should not be possible.");
                return;
            } else if (!doesEngineDie.equals("y")) {
                return;
            }

            System.out.print("Does your car have fuel injection? ");
            String doesHaveFuelInjection = in.nextLine().toLowerCase();
            if (doesHaveFuelInjection.equals("y")) {
                System.out.println("Get it in for service.");
            } else if (doesHaveFuelInjection.equals("n")) {
                System.out.println("Check to ensure the choke is opening and closing.");
            }
        }
    }
}
