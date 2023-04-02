import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------------------   WELCOME TO STONE PAAPER SCISSOR GAME           -----------------------------");
        System.out.println("1)-> Computer");
        System.out.println("2)-> You");
        int random = (int)(Math.random() * 3);
        System.out.println("\n scissor (0), \n rock (1),\n paper (2): ");
        System.out.println("enter your choice ");
        int userinput = sc.nextInt();
        System.out.println("The player 1 computer has choosen  ");
        switch (random)
        {
            case 0: System.out.print("scissor.");
                break;
            case 1: System.out.print("rock.");
                break;
            case 2: System.out.print("paper.");
        }

        System.out.println(" \nYou have choose  ");
        switch (userinput)
        {
            case 0:
                System.out.print("scissor");
                break;
            case 1: System.out.print("rock");
                break;
            case 2: System.out.print("paper ");
        }

        if (random == userinput)
            System.out.println(" too. \n It's a Draw");
        else
        {

            if ((userinput == 0 && random == 2) ||
                    (userinput == 1 && random == 0) || (userinput == 2 && random == 1)||
                    (userinput == 0 && random == 1)|| (userinput == 1 && random == 2))

                System.out.println(". \nYou are the winner");
            else
                System.out.println(".\n You are the looser");
        }
    }
    }
