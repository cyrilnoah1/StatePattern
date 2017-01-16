import state.Human;

/**
 * Class containing the main method.
 */
public class MainClass {

    /**
     * Main method.
     *
     * @param args String arguments.
     */
    public static void main(String[] args) {
        // Check Cyril daily routine.
        processDailyRoutineOfHuman();
    }

    /**
     * Processing the daily routine of humans.
     */
    private static void processDailyRoutineOfHuman() {
        Human cyrilNoah = new Human();
        // Day 1:
        cyrilNoah.getup();
        cyrilNoah.eat();
        cyrilNoah.sleep();
        // Day 2:
        cyrilNoah.getup();
        cyrilNoah.eat();
        cyrilNoah.sleep();
        // Day 3:
        cyrilNoah.getup();
        cyrilNoah.eat();
        cyrilNoah.sleep();
        // Day 4:
        cyrilNoah.getup();

        System.out.println("\nNumber of days spent: " + cyrilNoah.getDaysSpent());
        System.out.print("Cyril's current state: ");
        cyrilNoah.getStateAsString();
    }
}
