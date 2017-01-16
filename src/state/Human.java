package state;

/**
 * Human with different states of daily life.
 */
public class Human {
    private State getup;
    private State eat;
    private State sleep;

    private int daysSpent = 0;

    private State state;

    public Human() {
        getup = new Getup(this);
        eat = new Eat(this);
        sleep = new Sleep(this);

        state = getup;
    }

    /**
     * Getup.
     */
    public void getup() {
        state.getup();
    }

    /**
     * Eat.
     */
    public void eat() {
        state.eat();
    }

    /**
     * Sleep.
     */
    public void sleep() {
        state.sleep();
    }

    /**
     * To set the current state of the human.
     *
     * @param state State of human.
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Get the number of days spent.
     *
     * @return Number of days spent.
     */
    public int getDaysSpent() {
        return daysSpent;
    }

    /**
     * Increment the number of days spent by one.
     */
    public void incrementDaysSpent() {
        this.daysSpent++;
    }

    /**
     * State of getting up.
     * @return Getup state.
     */
    public State getGetup() {
        return getup;
    }

    /**
     * State of eating.
     * @return Eat state.
     */
    public State getEat() {
        return eat;
    }

    /**
     * State of sleeping.
     * @return Sleep state.
     */
    public State getSleep() {
        return sleep;
    }

    /**
     * Get the current state of the human.
     * @return Current state.
     */
    public State getState() {
        return state;
    }

    /**
     * Based on the current state, print the
     * statement representing it.
     */
    public void getStateAsString() {
        if (getState().equals(getup)) {
            state.getup();
        } else if (getState().equals(eat)) {
            state.eat();
        } else if (getState().equals(sleep)) {
            state.sleep();
        }
    }
}
