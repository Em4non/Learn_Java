package HomeWork_2.CardGame;

class NumberCard {
    public int[] cards;
    public int mark;
    public int nextmark;
    public int left, right;
    public static int num = 2;

    public NumberCard(int[] a) {
        cards = new int[4];
        System.arraycopy(a, 0, cards, 0, 4);
        left = 0;
        right = 0;
        mark = 0;
        nextmark = 0;
    }

    public NumberCard() {
        cards = new int[4];
        left = 0;
        right = 0;
        mark = 0;
        nextmark = 0;
    }

    public int getLeft() {
        return cards[3];
    }

    public int getRight() {
        return cards[1];
    }

    public void rotate() {
        for (int i = 0; i < 4; i++) {
            cards[i] = cards[(i - 1 + 4) % 4];
        }
    }
}