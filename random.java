public class random implements player{

    @Override
    public String description() {
        return "Randomly split or steal";
    }

    @Override
    public boolean play() {
        return Math.random() < 0.5;
    }
}
