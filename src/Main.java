import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        /*GameManager gameManager = new GameManager();
        Scanner scanner = new Scanner(System.in);
        String position;
        int check = 0;
        int played = 0;

        while (true) {//******************************************************

            System.out.println(":::::::::::Tic Tac Toe :::::::::::");
            gameManager.printTable();

            do {        //Player 1 move
                System.out.println("Player 1, What's your move?");
                position = scanner.next();
                while (!gameManager.check(position)) {
                    System.out.println("Invalid Move! Try Again!");
                    System.out.println("Player 1, What's your move?");
                    position = scanner.next();
                    check = 0;
                }
                gameManager.play(position, "X");
                check = 1;
            }
            while (check == 0); //End Player 1 move

            played++;
            check = 0;
            gameManager.printTable();
            if(!gameManager.winner(played).equals("null")){
                break;
            }

            do {        //Player 2 move
                System.out.println("Player 2, What's your move?");
                position = scanner.next();
                while (!gameManager.check(position)) {
                    System.out.println("Invalid Move! Try Again!");
                    System.out.println("Player 2, What's your move?");
                    position = scanner.next();
                    check = 0;
                }
                gameManager.play(position, "O");
                check = 1;
            }
            while (check == 0);     //End Player 2 move

            played++;
            check = 0;
            gameManager.printTable();
            if(!gameManager.winner(played).equals("null")){
                break;
            }
        }
        System.out.println("Winner " + gameManager.winner(played));
    }*/
    }
}
