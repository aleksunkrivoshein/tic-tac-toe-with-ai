package org.alexcompany;

class Game {
    static int n = 1;

    static void playerChoice(String player1, String player2, char[] array) {
        Gamer gamer1 = null;
        Gamer gamer2 = null;
        switch (player1) {
            case "easy":
                gamer1 = new AiEasy();
                break;
            case "medium":
                gamer1 = new AiMedium();
                break;
            case "user":
                gamer1 = new User();
                break;
        }
        switch (player2) {
            case "easy":
                gamer2 = new AiEasy();
                break;
            case "medium":
                gamer2 = new AiMedium();
                break;
            case "user":
                gamer2 = new User();
                break;
        }
        if (gamer1 != null && gamer2 != null) {
game(array, gamer1, gamer2); }

    }

    private static void game(char[] array, Gamer gamer1, Gamer gamer2) {
        while (true) {
            gamer1.Move(array);
            if (Check.gameState(array)) {
                break;
            }
            n++;
            gamer2.Move(array);
            if (Check.gameState(array)) {
                break;
            }
            n++;
        }
    }

}
