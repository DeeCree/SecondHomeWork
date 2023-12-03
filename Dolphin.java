public class Dolphin extends Animal implements Swimmable {
    public Dolphin(String name, String color) {
        super(name, color,0);
    }

    public Dolphin(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Визг");
    }

    @Override
    public void hunt() {}

    @Override
    public int getSwimmingSpeed() {
        return 45;
    }
}