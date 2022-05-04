package flashcards;

public class Main {
    public static void main(String[] args) {
        FlashCards cardDeck = new FlashCards();

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-import") && !args[i + 1].equals("-export")) {
                cardDeck.importCards(args[i]);
            }

            if (args[i].equals("-export") && !args[i + 1].equals("-import")) {
                cardDeck.exportCards(args[i]);
            }
        }

        do {
            cardDeck.setMenu();
            switch (cardDeck.getState()) {
                case ADD: cardDeck.addCard(); break;
                case REMOVE: cardDeck.removeCard(); break;
                case ASK: cardDeck.getCards(); break;
                case IMPORT: cardDeck.importCards(); break;
                case EXPORT: cardDeck.exportCards(); break;
                case LOG: cardDeck.log(); break;
                case HARDEST: cardDeck.printHardestCard(); break;
                case RESET: cardDeck.resetStats(); break;
                case EXIT: System.out.println("Bye Bye!"); break;
            }
        } while (cardDeck.isRunning());
    }
}