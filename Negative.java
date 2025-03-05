public class Negative implements player{

    @Override
    public boolean play(){
        return false;
    }

    @Override
    public String description() {
        return "Always plays Steal";
    }

    @Override
    public void result(boolean opponent){
        return;
    }
}