class Card {
    String symbol;
    String rank;

    public Card(String symbol, String rank) {
        this.symbol = symbol;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + symbol;
    }
}

class CardCollection {
    private static List<Card> cards = new ArrayList<>();

    public static void addCard(String symbol, String rank) {
        cards.add(new Card(symbol, rank));
        System.out.println("Card added successfully!");
    }

    public static void searchBySymbol(String symbol) {
        for (Card c : cards) {
            if (c.symbol.equalsIgnoreCase(symbol)) {
                System.out.println(c);
            }
        }
    }

    public static void displayCards() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        CardCollection.addCard("Hearts", "Ace");
        CardCollection.searchBySymbol("Hearts");
    }
}
