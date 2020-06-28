package hellocucumber;

import jep.Interpreter;
import jep.JepException;
import jep.SharedInterpreter;


public class PyNinjaFightPlan extends NinjaFightPlan {

    Interpreter interp = null;

    public PyNinjaFightPlan() {
        try {
            this.interp = new SharedInterpreter();
            this.interp.exec("import pyninja.NinjaFightPlan");
            this.interp.exec("fightPlan = pyninja.NinjaFightPlan()");
        } catch (JepException je) {
            System.err.println(je);
        }
    }
 
    public PyNinjaFightPlan(int beltIn) {
        try {
            this.interp = new SharedInterpreter();
            this.interp.exec("import pyninja.NinjaFightPlan");
            this.interp.exec("fightPlan = pyninja.NinjaFightPlan()");
            this.interp.invoke("fightPlan.setNinjaBelt", beltIn);
        } catch (JepException je) {
            System.err.println(je);
        }
    }

    public void setNinjaBelt(int beltIn) {
        try {
            this.interp.invoke("fightPlan.setNinjaBelt", beltIn);
        } catch (JepException je) {
            System.err.println(je);
        }
    }

    public int getNinjaBelt() {
        int returnBelt = 0;
        try {
            returnBelt = (int)this.interp.invoke("fightPlan.getNinjaBelt");
        } catch (JepException je) {
            System.err.println(je);
        }
        return returnBelt;
    }

    public void setOpponentBelt(int beltIn) {
        try {
            this.interp.invoke("fightPlan.setOpponentBelt", beltIn);
        } catch (JepException je) {
            System.err.println(je);
        }
    }

    public int getOpponentBelt() {
        int returnBelt = 0;
        try {
            returnBelt = (int)this.interp.invoke("fightPlan.getOpponentBelt");
        } catch (JepException je) {
            System.err.println(je);
        }
        return returnBelt;
    }

    public boolean fightOpponent() {
        boolean returnFightDecision = false;
        try {
            returnFightDecision = (boolean)this.interp.invoke("fightPlan.fightOpponent");
        } catch (JepException je) {
            System.err.println(je);
        }
        return returnFightDecision;
    }

    public boolean fightOpponent(int opponentBeltIn) {
        boolean returnFightDecision = false;
        try {
            returnFightDecision = (boolean)this.interp.invoke("fightPlan.fightOpponent", opponentBeltIn);
        } catch (JepException je) {
            System.err.println(je);
        }
        return returnFightDecision;
    }
}
