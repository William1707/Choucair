package co.com.choucair.certification.pruebaTecnica.exceptions.stepdefinitions;

import co.com.choucair.certification.pruebaTecnica.exceptions.model.AcademyChoucairData;
import co.com.choucair.certification.pruebaTecnica.exceptions.questions.Answer;
import co.com.choucair.certification.pruebaTecnica.exceptions.tasks.Login;
import co.com.choucair.certification.pruebaTecnica.exceptions.tasks.OpenUp;
import co.com.choucair.certification.pruebaTecnica.exceptions.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;


public class ChourcairAcademyStepDefintions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }


    @Given("than brandon  wants to learn automation at the academy Choucair")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData>academyChoucairData) throws Exception {

        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),Login.
            onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));

    }

    @When("he search for the course (.*) on the choucair academy platform")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData ) throws Exception {

        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));

    }

    @Then("he finds the course called resources (.*)")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia(List<AcademyChoucairData> academyChoucairData) throws  Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0))));

    }

}
