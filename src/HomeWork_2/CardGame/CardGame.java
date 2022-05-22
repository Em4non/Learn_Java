package HomeWork_2.CardGame;

class CardGame {
    public NumberCard[] card;
    public CardGame() {
        card=new NumberCard[100];
        for(int i=0;i<100;i++){
            card[i]=new NumberCard();
        }
        card[0].nextmark = 1;
        card[1].mark=1;
    }

    public int getIndexForFit(NumberCard c) {
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j != 1;) {
                boolean left = false, right = false;
                NumberCard a = card[j], b = card[card[j].nextmark];
                if (a.mark == 0 || a.cards[1] == c.cards[3])
                    left = true;
                if (b.mark == 1 || b.cards[3] == c.cards[1])
                    right = true;
                if (left && right) {
                    return j;
                }
                j = card[j].nextmark;
            }
            c.rotate();
        }
        return -1;
    }

    public boolean insertCard(NumberCard c) {
        int x = getIndexForFit(c);
        if (x == -1)
            return false;
        c.nextmark = card[x].nextmark;
        card[x].nextmark = c.mark;
        card[c.mark]=c;
        return true;
    }

    public void print() {
        int x = card[0].nextmark;
        boolean flag=false;
        while (x != 1) {
            for (int i = 0; i < 4; i++) {
                if(flag)
                    System.out.print(" "+card[x].cards[i]);
                else
                    System.out.print(card[x].cards[i]);
                flag=true;
            }
            x=card[x].nextmark;
        }

    }
}