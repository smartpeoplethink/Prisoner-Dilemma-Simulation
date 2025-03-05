

public class Tester implements player{
    boolean[] MyFirstSet = {true, false, false, true};
    int testLength = 4;
    boolean[] OpponentFirstSet = new boolean[testLength];

    player negative = new Negative();
    player tit_for_tat = new Tit_for_Tat();
    player strat;
    int index = 0;

    @Override
    public String description(){
        return "Does a test in the beginning. Either tit for tat or negative";
    }
    @Override
    public boolean play(){
        index++;
        if (index>testLength) {
            if (index == testLength+1) {
                if ((OpponentFirstSet[1] != OpponentFirstSet[2])&&(OpponentFirstSet[2] == OpponentFirstSet[3])){
                    strat = tit_for_tat;
                }else{
                    strat = negative;
                }
            }
            strat.play();

        }
        return MyFirstSet[index];
    }

    @Override
    public void result(boolean opponent){
           if (index <=testLength){
               OpponentFirstSet[index-1] = opponent;
           }else{
               strat.result(opponent);
           }
    }
}
