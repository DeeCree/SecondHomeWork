public class Doctor extends Staff {
    public Doctor(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Давно не виделись, что случилось с животным ?");
    }
}