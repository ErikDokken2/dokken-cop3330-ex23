package exercises.ex23;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex23 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        ex23 example23 = new ex23();

        String start = example23.start();
        example23.tree(start);
    }

    void tree(String start) {
        if(start.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            String key = input.nextLine();
            if(key.equals("y"))
            {
                System.out.print("Clean terminals and try starting again. ");
                System.exit(0);
            }
            else
                System.out.print("The battery cables may be damaged.\n" +
                        "Replace cables and try again.");
            System.exit(0);
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            String key = input.nextLine();
            if(key.equals("y"))
            {
                System.out.print("Replace the battery. ");
                System.exit(0);
            }
            else
            {
                System.out.print("Does the car crank up but fail to start?");
                key = input.nextLine();
                if(key.equals("y"))
                {
                    System.out.print("Check spark plug connections. ");
                    System.exit(0);
                }
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    key = input.nextLine();
                    if(key.equals("y"))
                    {
                        System.out.print("Does you car have fuel injection? ");
                        key = input.nextLine();
                        if(key.equals("y"))
                        {
                            System.out.print("Get it in for service. ");
                            System.exit(0);
                        }
                        else
                        {
                            System.out.print("Check to ensure the choke is opening and closing. ");
                            System.exit(0);
                        }

                    }
                    else
                    {
                        System.out.print("This should not be possible. ");
                        System.exit(0);
                    }
                }
            }
        }
    }

    private String start() {
        System.out.print("Is the car silent when you turn the key? ");
        String key = input.nextLine();
        return key;
    }

}
