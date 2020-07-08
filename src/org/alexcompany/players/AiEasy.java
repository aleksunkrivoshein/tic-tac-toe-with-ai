package org.alexcompany.players;

import org.alexcompany.check.Check;
import org.alexcompany.game.Game;
import org.alexcompany.matrix.Matrix;
import org.alexcompany.print.Print;

import java.util.Random;

public class AiEasy extends Gamer {

    private static Random random = new Random();

    public void Move(char[] array) {
        System.out.println("Making move level \"easy\"");

        while (true) {

            if (!Check.emptyCells(array)) {
                break;
            }
            int index = random.nextInt(9);
            if (array[index] == '_') {
                if (Game.n % 2 == 0) {
                    array[index] = 'O';
                } else {
                    array[index] = 'X';
                }

                char[][] arrayNew = Matrix.array33(array);

                Print.print(arrayNew);
                break;
            }
        }
    }
}
