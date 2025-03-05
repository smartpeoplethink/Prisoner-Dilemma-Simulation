public class Tit_for_Tat implements player {



    boolean lastplay = true;

    @Override
    public String description(){
        return "Does the opponents last play";
    }
    @Override
    public boolean play(){
        return lastplay;
    }

    @Override
    public void result(boolean opponent){
        lastplay = opponent;
        return;
    }
}
