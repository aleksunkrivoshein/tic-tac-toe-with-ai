package org.alexcompany.check;

public class IndexDefinition {

    public static int indexDefinition(int a, int b) {
        int index = 10;
        switch (a) {
            case 1:
                if (b == 1) {
                    index = 6;
                } else if (b == 2) {
                    index = 3;
                } else if (b == 3) {
                    index = 0;
                }
                break;
            case 2:
                if (b == 1) {
                    index = 7;
                } else if (b == 2) {
                    index = 4;
                } else if (b == 3) {
                    index = 1;
                }
                break;
            case 3:
                if (b == 1) {
                    index = 8;
                } else if (b == 2) {
                    index = 5;
                } else if (b == 3) {
                    index = 2;
                }
                break;
        }
        return index;
    }
}
