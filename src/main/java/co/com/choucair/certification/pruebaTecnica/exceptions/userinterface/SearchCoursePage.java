package co.com.choucair.certification.pruebaTecnica.exceptions.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject
{
    public  static final Target BUTTON_UNIVERSIDAD =Target.the("Seleccionamos la universidad choucair").located(By.id("universidad"));
    public  static final Target INPUT_COURSE =Target.the("Buscar curso").located(By.id("coursesearchbox"));
    public  static final Target BUTTON_GO =Target.the("Presionamos el boton de buscar curso").located(By.xpath("//button[@class='btn btn-secondary']"));
    public  static final Target SELECT_COURSE =Target.the("Click para buscar el curso").located(By.xpath("//h4[contains(text(), 'Recursos Automatización Bancolombia')]"));
    public static  final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("//h1[contains(text(),'Recursos Automatizacion Bancolombia')]")) ;
}
