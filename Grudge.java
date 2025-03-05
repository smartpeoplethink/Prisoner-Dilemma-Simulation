public class Grudge implements player {
    boolean Innocent = true;
    @Override
    public String description(){
        return "Will play split until opponent plays steal. They will play steal the rest of the game";
    }

    @Override
    public boolean play(){
        return Innocent;
    }
    @Override
    public void result(boolean opponent){
        if (!opponent){
            Innocent = false;
        }
    }
}
