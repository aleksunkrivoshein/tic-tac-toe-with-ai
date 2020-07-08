package org.alexcompany;

class Matrix {

    static char[][] array33(char[] array) {
        char[][] array33 = new char[3][3];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array33[i][j] = array[k];
                k++;
            }

        }
        return array33;
    }
}
