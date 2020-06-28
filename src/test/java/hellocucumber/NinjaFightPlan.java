package hellocucumber;


public class NinjaFightPlan {

    public static final int WHITE = 1;
    public static final int GRAY = 2;
    public static final int YELLOW = 3;
    public static final int ORANGE = 4;
    public static final int GREEN = 5;
    public static final int BLUE = 6;
    public static final int PURPLE = 7;
    public static final int BLACK = 8;
    public static final int BLACK_1ST = 9;
    public static final int BLACK_2ND = 10;
    public static final int BLACK_3RD = 11;
    public static final int BLACK_4TH = 12;
    public static final int BLACK_5TH = 13;
    public static final int BLACK_6TH = 14;
    public static final int BLACK_7TH = 15;
    public static final int BLACK_8TH = 16;
    public static final int BLACK_9TH = 17;
    public static final int BLACK_10TH = 18;
    public static final int CHUCK_NORRIS = 10000000;

    private int ninjaBelt;
    private int opponentBelt;

    public NinjaFightPlan() {
    }
 
    public NinjaFightPlan(int beltIn) {
        this.ninjaBelt = beltIn;
    }

    public void setNinjaBelt(int beltIn) {
        this.ninjaBelt = beltIn;
    }

    public int getNinjaBelt() {
        return this.ninjaBelt;
    }

    public void setOpponentBelt(int beltIn) {
        this.opponentBelt = beltIn;
    }

    public int getOpponentBelt() {
        return this.opponentBelt;
    }

    public boolean fightOpponent() {
        return this.fightOpponent(this.opponentBelt);
    }

    public boolean fightOpponent(int opponentBeltIn) {
        boolean returnFightDecision = false;
        if (opponentBeltIn < this.ninjaBelt) {
            returnFightDecision = true;
        }
        return returnFightDecision;
    }
}
