import java.util.*;

public class blackJack {
    private deck deck;
    private player player;
    private player dealer;
    private Scanner scanner;

    public blackJack() {
        deck = new deck();
        player = new player("You");
        dealer = new player("Dealer");
        scanner = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println("=== Blackjack ===");

        // Deal 2 cards each
        for (int i = 0; i < 2; i++) {
            player.drawCard(deck);
            dealer.drawCard(deck);
        }

        // Show player's hand
        player.showhand();
        System.out.println("Dealer shows: " + dealer.gethand().get(0));

        // player turn
        while (true) {
            int playerScore = calculateScore(player.gethand());
            System.out.println("Your current score: " + playerScore);

            if (playerScore > 21) {
                System.out.println("You busted! Dealer wins.");
                return;
            }

            System.out.print("Do you want to [H]it or [S]tand? ");
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("h")) {
                player.drawCard(deck);
                player.showhand();
            } else if (choice.equals("s")) {
                break;
            } else {
                System.out.println("Invalid input.");
            }
        }

        // Dealer turn
        System.out.println("\nDealer's turn:");
        dealer.showhand();
        while (calculateScore(dealer.gethand()) < 17) {
            System.out.println("Dealer hits.");
            dealer.drawCard(deck);
            dealer.showhand();
        }

        int dealerScore = calculateScore(dealer.gethand());
        int playerScore = calculateScore(player.gethand());

        System.out.println("\nFinal Scores:");
        System.out.println("Your score: " + playerScore);
        System.out.println("Dealer score: " + dealerScore);

        // Determine winner
        if (dealerScore > 21 || playerScore > dealerScore) {
            System.out.println("You win!");
        } else if (playerScore < dealerScore) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    private int calculateScore(List<card> hand) {
        int score = 0;
        int aceCount = 0;

        for (card card : hand) {
            String rank = card.getRank();

            if (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")) {
                score += 10;
            } else if (rank.equals("Ace")) {
                aceCount++;
                score += 11;
            } else {
                score += Integer.parseInt(rank);
            }
        }

        // Adjust for Aces
        while (score > 21 && aceCount > 0) {
            score -= 10;
            aceCount--;
        }

        return score;
    }

    public static void main(String[] args) {
        blackJack game = new blackJack();
        game.startGame();
    }
}