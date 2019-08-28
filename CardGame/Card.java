package CardGame;

public class Card implements Comparable<Card> {
    public final int suitNumber;
    public final int rankNumber;

    public Card(int suitNumber, int rankNumber) {
        this.suitNumber = suitNumber;
        this.rankNumber = rankNumber;
    }

    public String getSuit() {
        switch (suitNumber) {
            case 1:
                return "Clubs";
            case 2:
                return "Diamonds";
            case 3:
                return "Hearts";
            case 4:
                return "Spades";
            default:
                return "";
        }
    }

    public String getRank() {
        switch (rankNumber) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return String.valueOf(rankNumber);
        }
    }

    public String toString() {
        return getRank() + " of " + getSuit();
    }

    // The one with higher suitNumber is BIGGER (if the same, the one with higher rank is!)
    @Override
    public int compareTo(Card o) {
        if(suitNumber != o.suitNumber) {
            return suitNumber - o.suitNumber;
        }

        return rankNumber - o.rankNumber;
    }
}