package org.alexcompany;

class Check {

    static boolean emptyCells(char[] array) {
        boolean emptyCells = false;
        for (char c : array) {
            if (c == '_') {
                emptyCells = true;
            }
        }
        return emptyCells;
    }

    private static boolean xWins(char[] array) {
        boolean xWins = false;
        if (array[0] == 'X' && array[1] == 'X' && array[2] == 'X') {
            xWins = true;
        }
        if (array[3] == 'X' && array[4] == 'X' && array[5] == 'X') {
            xWins = true;
        }
        if (array[6] == 'X' && array[7] == 'X' && array[8] == 'X') {
            xWins = true;
        }
        if (array[0] == 'X' && array[3] == 'X' && array[6] == 'X') {
            xWins = true;
        }
        if (array[1] == 'X' && array[4] == 'X' && array[7] == 'X') {
            xWins = true;
        }
        if (array[2] == 'X' && array[5] == 'X' && array[8] == 'X') {
            xWins = true;
        }
        if (array[0] == 'X' && array[4] == 'X' && array[8] == 'X') {
            xWins = true;
        }
        if (array[2] == 'X' && array[4] == 'X' && array[6] == 'X') {
            xWins = true;
        }
        return xWins;
    }

    private static boolean oWins(char[] array) {
        boolean xWins = false;
        if (array[0] == 'O' && array[1] == 'O' && array[2] == 'O') {
            xWins = true;
        }
        if (array[3] == 'O' && array[4] == 'O' && array[5] == 'O') {
            xWins = true;
        }
        if (array[6] == 'O' && array[7] == 'O' && array[8] == 'O') {
            xWins = true;
        }
        if (array[0] == 'O' && array[3] == 'O' && array[6] == 'O') {
            xWins = true;
        }
        if (array[1] == 'O' && array[4] == 'O' && array[7] == 'O') {
            xWins = true;
        }
        if (array[2] == 'O' && array[5] == 'O' && array[8] == 'O') {
            xWins = true;
        }
        if (array[0] == 'O' && array[4] == 'O' && array[8] == 'O') {
            xWins = true;
        }
        if (array[2] == 'O' && array[4] == 'O' && array[6] == 'O') {
            xWins = true;
        }
        return xWins;
    }

    static boolean gameState(char[] array) {
        boolean gameState = false;
        if (Check.xWins(array)) {
            System.out.println("X wins");
            return true;
        }
        if (Check.oWins(array)) {
            System.out.println("O wins");
            return true;
        }
        if (!Check.emptyCells(array)) {
            System.out.println("Draw");
            return true;
        }
        return gameState;
    }

    static int searchForTwoInArow(char[] array, char ox) {

        int[][] arrayIndex = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8,}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {6, 4, 2}};
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < 8; i++) {
            if (flag) {
                break;
            }
            int n = 0;
            for (int j = 0; j < 3; j++) {
                int x = arrayIndex[i][j];
                if (array[x] == ox) {
                    n++;
                }
            }
            if (n == 2) {
                for (int k = 0; k < 3; k++) {
                    int x1 = arrayIndex[i][k];
                    if (array[x1] == '_') {
                        index = x1;
                        flag = true;
                    }
                }
            }
        }
        return index;
    }

}
