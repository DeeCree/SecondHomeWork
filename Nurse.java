public class Nurse extends Staff {
    public Nurse(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Сейчас сделаем укол, и все будет хорошо");
    }
}