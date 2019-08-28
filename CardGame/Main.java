package CardGame;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Deck");
        System.out.println("----------");
        // Create new 52 standard Card
        Deck standardDeck = new Deck();

        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                Card newCard = new Card(suit, rank);

                standardDeck.addCard(newCard);
            }
        }

        // Shuffle the card
        standardDeck.shuffle();

        // Deal
        Deck hand1 = standardDeck.deal(5);
        Deck hand2 = standardDeck.deal(5);

        // Print each hand
        hand1.print();
        System.out.println("----------");
        hand2.print();

        //--------------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("----------");
        System.out.println("BlackjackCard");
        System.out.println("----------");

        BlackjackCard card1 = new BlackjackCard(1, 1);
        BlackjackCard card2 = new BlackjackCard(2, 6);
        BlackjackCard card3 = new BlackjackCard(4, 12);

        System.out.println(card1.getValue());
        System.out.println(card1.isAce());
        System.out.println(card2.getValue());
        System.out.println(card2.isAce());
        System.out.println(card3.getValue());
        System.out.println(card3.isAce());

        //--------------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("----------");
        System.out.println("BlackjackHand");
        System.out.println("----------");

        BlackjackHand blackjackHand1 = new BlackjackHand();
        blackjackHand1.addCard(new BlackjackCard(3, 1));
        blackjackHand1.addCard(new BlackjackCard(4, 11));
        System.out.println("blackjackHand1:");
        System.out.println(blackjackHand1.getValue());
        System.out.println(blackjackHand1.isBlackjack());
        System.out.println(blackjackHand1.isBusted());
        System.out.println();

        BlackjackHand blackjackHand2 = new BlackjackHand();
        blackjackHand2.addCard(new BlackjackCard(1, 4));
        blackjackHand2.addCard(new BlackjackCard(2, 8));
        blackjackHand2.addCard(new BlackjackCard(2, 9));
        System.out.println("blackjackHand2:");
        System.out.println(blackjackHand2.getValue());
        System.out.println(blackjackHand2.isBlackjack());
        System.out.println(blackjackHand2.isBusted());
        System.out.println();

        BlackjackHand blackjackHand3 = new BlackjackHand();
        blackjackHand3.addCard(new BlackjackCard(2, 5));
        blackjackHand3.addCard(new BlackjackCard(4, 9));
        blackjackHand3.addCard(new BlackjackCard(2, 13));
        System.out.println("blackjackHand3:");
        System.out.println(blackjackHand3.getValue());
        System.out.println(blackjackHand3.isBlackjack());
        System.out.println(blackjackHand3.isBusted());
        System.out.println();

        BlackjackHand blackjackHand4 = new BlackjackHand();
        blackjackHand4.addCard(new BlackjackCard(2, 8));
        blackjackHand4.addCard(new BlackjackCard(1, 1));
        System.out.println("blackjackHand4:");
        System.out.println(blackjackHand4.getValue());
        System.out.println(blackjackHand4.isBlackjack());
        System.out.println(blackjackHand4.isBusted());
        System.out.println();

        BlackjackHand blackjackHand5 = new BlackjackHand();
        blackjackHand5.addCard(new BlackjackCard(1, 7));
        blackjackHand5.addCard(new BlackjackCard(1, 9));
        blackjackHand5.addCard(new BlackjackCard(3, 1));
        System.out.println("blackjackHand5:");
        System.out.println(blackjackHand5.getValue());
        System.out.println(blackjackHand5.isBlackjack());
        System.out.println(blackjackHand5.isBusted());
        System.out.println();

        BlackjackHand blackjackHand6 = new BlackjackHand();
        blackjackHand6.addCard(new BlackjackCard(2, 1));
        blackjackHand6.addCard(new BlackjackCard(1, 1));
        System.out.println("blackjackHand6:");
        System.out.println(blackjackHand6.getValue());
        System.out.println(blackjackHand6.isBlackjack());
        System.out.println(blackjackHand6.isBusted());
        System.out.println();
    }
}