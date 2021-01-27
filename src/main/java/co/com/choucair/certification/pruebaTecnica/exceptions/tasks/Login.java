package co.com.choucair.certification.pruebaTecnica.exceptions.tasks;

import co.com.choucair.certification.pruebaTecnica.exceptions.userinterface.ChourCairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String strUSer;
    private String strPassword;


    public static Login onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class,strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Click.on(ChourCairLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUSer).into(ChourCairLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(ChourCairLoginPage.INPUT_PASSWORD),
                Click.on(ChourCairLoginPage.ENTER_BUTTON)
        );

    }

}
