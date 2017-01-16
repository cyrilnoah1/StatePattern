package state;

/**
 * Getup after sleeping.
 */
public class Getup implements State {
    Human human;

    public Getup(Human human) {
        this.human = human;
    }

    @Override
    public void getup() {
        System.out.println("Woke up after sleeping");
        human.setState(human.getEat());
    }

    @Override
    public void eat() {
        throw new IllegalStateException();
    }

    @Override
    public void sleep() {
        throw new IllegalStateException();
    }
}
