package hellocucumber;

import jep.JepConfig;
import jep.JepException;
import jep.SharedInterpreter;


public class PyNinjaFightPlan extends NinjaFightPlan {

    SharedInterpreter interp = null;

    private void setJepConfig() {
        try {
            JepConfig jepcfg = new JepConfig();
            jepcfg.addIncludePaths("./pyninja");

            SharedInterpreter.setConfig(jepcfg);
        } catch (JepException je) {
        }
    }

    private void setUpNinjaFightPlan() {
        this.setJepConfig();
        try {
            this.interp = new SharedInterpreter();
            this.interp.exec("from NinjaFightPlan import NinjaFightPlan");
            this.interp.exec("fightPlan = NinjaFightPlan()");
        } catch (JepException je) {
            System.err.println(je);
        }
    }

    public PyNinjaFightPlan() {
        this.setUpNinjaFightPlan();
    }
 
    public PyNinjaFightPlan(int beltIn) {
        this.setUpNinjaFightPlan();
        try {
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

    public void close() {
        try {
            this.interp.close();
        } catch (JepException je) {
            System.err.println(je);
        }
    }
}
