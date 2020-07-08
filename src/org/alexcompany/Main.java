package org.alexcompany;

import org.alexcompany.game.Game;
import org.alexcompany.matrix.Matrix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            Game.n = 1;
            System.out.print("Input command ");
            String game = scanner.next();
            if (game.equals("exit")) {
                break;
            }
            if (!(game.equals("start")) && !(game.equals("exit"))) {
                System.out.println("enter start or exit");
                continue;
            }

            String player1 = scanner.next();
            if (!(player1.equals("user")) && !(player1.equals("easy")) && !(player1.equals("medium"))) {
                System.out.println("enter user or easy");
                continue;
            }

            String player2 = scanner.next();
            if (!(player2.equals("user")) && !(player2.equals("easy")) && !(player2.equals("medium"))) {
                System.out.println("enter user or easy or medium");
                continue;
            }
            String line = "_________";
            char[] array = line.toCharArray();
            Matrix.array33(array);

            Game.playerChoice(player1, player2, array);

        }
    }

}


