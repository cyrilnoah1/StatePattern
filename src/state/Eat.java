package state;

/**
 * Eating food after getting up.
 */
public class Eat implements State {
    Human human;

    public Eat(Human human) {
        this.human = human;
    }

    @Override
    public void getup() {
        throw new IllegalStateException();
    }

    @Override
    public void eat() {
        System.out.println("Ate some food.");
        human.setState(human.getSleep());
    }

    @Override
    public void sleep() {
        throw new IllegalStateException();
    }
}
