package org.alexcompany;

import java.util.Random;

class AiMedium extends Gamer {

    static private Random random = new Random();

    void Move(char[] array) {
        System.out.println("Making move level \"medium\"");

        while (true) {

            if (!Check.emptyCells(array)) {
                break;
            }
            int index = 0;
            if (Game.n % 2 == 0) {
                index = Check.searchForTwoInArow(array, 'O');
                if (index != 0) {
                    array[index] = 'O';
                    char[][] arrayNew = Matrix.array33(array);
                    Print.print(arrayNew);
                    break;
                } else {
                    index = Check.searchForTwoInArow(array, 'X');
                    if (index != 0) {
                        array[index] = 'O';
                        char[][] arrayNew = Matrix.array33(array);
                        Print.print(arrayNew);
                        break;
                    }
                }
            } else {
                index = Check.searchForTwoInArow(array, 'X');
                if (index != 0) {
                    array[index] = 'X';
                    char[][] arrayNew = Matrix.array33(array);
                    Print.print(arrayNew);
                    break;
                } else {
                    index = Check.searchForTwoInArow(array, 'O');
                    if (index != 0) {
                        array[index] = 'X';
                        char[][] arrayNew = Matrix.array33(array);
                        Print.print(arrayNew);
                        break;
                    }
                }
            }
            if (index == 0) {
                index = random.nextInt(9);
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
}
