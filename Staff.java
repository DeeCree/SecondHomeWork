public abstract class Staff extends Animal implements Speakable {
    public Staff(String name) {
        super(name, null, 2);
    }

    @Override
    public void speak() {
        System.out.printf("Добрый день, меня зовут %s%n", this.getName());
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getType(), this.getName());
    }

    @Override
    public void hunt() {}

    public abstract void work();
}