package co.com.choucair.certification.pruebaTecnica.exceptions.questions;


import co.com.choucair.certification.pruebaTecnica.exceptions.model.AcademyChoucairData;
import co.com.choucair.certification.pruebaTecnica.exceptions.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {
    private  String question;

    public Answer (String question) {
        this.question = question;
    }
    public  static  Answer toThe(AcademyChoucairData question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       Boolean result;
       String nameCourse= Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
       if (question.equals(nameCourse)){
           result= true;
       }
       else {
           result= false;
       }
       return result;
    }

}
