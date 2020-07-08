package org.alexcompany;

class Print {

    static void print(char[][] array) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("|");
            if (i < 2) {
                System.out.println();
            }
        }
        System.out.println("---------");
        System.out.println();
    }
}
