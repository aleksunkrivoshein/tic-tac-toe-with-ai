package org.alexcompany.players;

import org.alexcompany.check.Check;
import org.alexcompany.check.IndexDefinition;
import org.alexcompany.game.Game;
import org.alexcompany.matrix.Matrix;
import org.alexcompany.print.Print;

import java.util.Scanner;

public class User extends Gamer {
    private static Scanner scanner = new Scanner(System.in);

    public void Move(char[] array) {
        while (true) {
            if (!Check.emptyCells(array)) {
                break;
            }
            System.out.print("Enter the coordinates: ");

            String line1 = scanner.next();

            int coord1 = 0;
            int coord2 = 0;
            try {
                coord1 = Integer.parseInt(line1);
            } catch (NumberFormatException e) {

                System.out.println("You should enter numbers!");
                continue;
            }
            String line2 = scanner.next();
            try {
                coord2 = Integer.parseInt(line2);
            } catch (NumberFormatException e) {

                System.out.println("You should enter numbers!");
                continue;
            }
            int index = IndexDefinition.indexDefinition(coord1, coord2);
            if (index > 8) {

                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            if (array[index] == '_') {
                if (array[index] == '_') {
                    if (Game.n % 2 == 0) {
                        array[index] = 'O';
                    } else {
                        array[index] = 'X';
                    }

                    char[][] arrayNew = Matrix.array33(array);

                    Print.print(arrayNew);
                    break;
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            }
        }
    }
}
