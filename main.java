

public class main{
    //Split is true and is 1
    // P1⇨     Split    Steal
    //P2⇩
    // Split     4,4      1,5
    // Steal     5,1      2,2
    public static void printer(String description, int Result, String name){
        System.out.println("Player "+name+": ");
        System.out.println("Plays by the following rule: "+description);
        System.out.println("In this match, they recieved:");
        System.out.print(Result);
        System.out.println(" Points");
        System.out.println();
    }
    public static int[][][] result = {{{2,2},{5,1}}, {{1,5},{4,4}}};
    public static int[] play(boolean player1, boolean player2){
        return result[(player1 ? 1:0)][(player2 ? 1:0)]; 
    }

    public static void main(String[] args){
        player p1 = new Tit_for_Tat();
        player p2 = new Grudge();
        boolean p1Result;
        boolean p2Result; 
        int[] PointsLast;
        int p1PointsTotal = 0;
        int p2PointsTotal = 0;

        for (int i = 0; i<10; i++){
            p1Result = p1.play();
            p2Result = p2.play();
            
            p1.result(p2Result);
            p2.result(p1Result);

            PointsLast = play(p1Result, p2Result);

            p1PointsTotal+=PointsLast[0];
            p2PointsTotal+=PointsLast[1];
        }
        
        printer(p1.description(), p1PointsTotal, "one");
        printer(p2.description(), p2PointsTotal, "two");
    }
    


}