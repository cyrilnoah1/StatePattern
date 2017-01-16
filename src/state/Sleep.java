package state;

/**
 * Sleep after eating.
 */
public class Sleep implements State {
    Human human;

    public Sleep(Human human) {
        this.human = human;
    }

    @Override
    public void getup() {
        throw new IllegalStateException();
    }

    @Override
    public void eat() {
        throw new IllegalStateException();
    }

    @Override
    public void sleep() {
        System.out.println("Slept...\n");
        human.setState(human.getGetup());
        human.incrementDaysSpent();
    }
}
