package org.alexcompany;

import java.util.Random;

class AiEasy extends Gamer {

    private static Random random = new Random();

    void Move(char[] array) {
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
