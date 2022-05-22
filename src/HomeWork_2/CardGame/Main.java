package HomeWork_2.CardGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[4];
        CardGame cardgame = new CardGame();
        cardgame.card[0].nextmark = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                a[j] = input.nextInt();
            }
            NumberCard c = new NumberCard(a);
            c.mark = NumberCard.num++;
            cardgame.insertCard(c);
        }
        cardgame.print();
    }
}