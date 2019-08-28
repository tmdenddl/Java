package CardGame;

public class BlackjackHand extends Deck<BlackjackCard> {

    public int getValue() {
        int sum = 0;
        int aceCount = 0;

        for(BlackjackCard card: getCards()) {

            // Count number of Ace cards
            if(card.isAce()) {
                aceCount++;
            }

            sum += card.getValue();
        }

        // turn ace 11 -> 1 until sum =< 21
        while (sum > 21 && aceCount > 0) {
            sum -= 10;
            aceCount--;
        }

        return sum;
    }

    public boolean isBusted() {
        return getValue() > 21;
    }

    public boolean isBlackjack() {
        return (getValue() == 21 && getCards().size() == 2);
    }
}
