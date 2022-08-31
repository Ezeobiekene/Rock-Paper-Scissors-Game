import java.util.Scanner;
import java.util.Random;


public class Selection {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int scissors = 0;
        int rock = 1;
        int paper = 2;
        int player;
        int x = random.nextInt(3); //x is the variable for the computer's random pick


        System.out.println("This is a Rock, Paper, Scissors Game!!" +
                " The computer will Be your opponent!!" + " To pick Scissors enter 0, To pick Rock enter 1 and To pick Paper enter 2");

        System.out.print("Enter the corresponding integer of your pick: ");
        player = input.nextInt();


        if (player == 0)
            System.out.println("You have Chosen Scissors!!");

        else if (player == 1)
            System.out.println("You have Chosen Rock!!");

        else
            System.out.println("You have Chosen Paper!!");

        switch (x) {
            case 0:
                if (player == 0)
                    System.out.println("The computer is scissor. You are scissor too. It is a draw =)");

                else if (player == 1)
                    System.out.println("The computer is scissor. You are rock. You won!!");

                else
                    System.out.println("The computer is scissor. You are paper. You lost =("); break;


            case 1:
                if (player == 0)
                    System.out.println("The computer is rock. You are scissor too. You lost =(");

                else if (player == 1)
                    System.out.println("The computer is rock. You are rock too. It is a draw =)");

                else
                    System.out.println("The computer is rock. You are paper. You won!!"); break;


            case 2:
                if (player == 0)
                    System.out.println("The computer is paper. You are scissor too. You won!!");

                else if (player == 1)
                    System.out.println("The computer is paper. You are rock. You lost =(");

                else
                    System.out.println("The computer is paper. You are paper. It is a draw =)"); break;

        }

        System.out.println("Play again!");
    }

}
