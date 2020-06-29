package hellocucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    private PyNinjaFightPlan ninjaPlan = null;

    @Before
    public void set_up_ninja_fight_plan() {
        this.ninjaPlan = new PyNinjaFightPlan();
    }

    @Given("the ninja has a third level black-belt")
    public void the_ninja_has_a_third_level_black_belt() {
        this.ninjaPlan.setNinjaBelt(NinjaFightPlan.BLACK_3RD);
    }

    @When("attacked by a samurai")
    public void attacked_by_a_samurai() {
        this.ninjaPlan.setOpponentBelt(NinjaFightPlan.BLACK_2ND);
    }

    @When("attacked by Jean-Claude Van Damme")
    public void attacked_by_Jean_Claude_Van_Damme() {
        this.ninjaPlan.setOpponentBelt(NinjaFightPlan.BLACK_3RD);
    }

    @When("attacked by Chuck Norris")
    public void attacked_by_Chuck_Norris() {
        this.ninjaPlan.setOpponentBelt(NinjaFightPlan.CHUCK_NORRIS);
    }

    @Then("the ninja should engage the opponent")
    public void the_ninja_should_engage_the_opponent() {
        assertEquals(this.ninjaPlan.fightOpponent(), true);
    }

    @Then("the ninja should run for his life")
    public void the_ninja_should_run_for_his_life() {
        assertEquals(this.ninjaPlan.fightOpponent(), false);
    }

    @After
    public void close_ninja_fight_plan() {
        this.ninjaPlan.close();
        this.ninjaPlan = null;
    }
}
