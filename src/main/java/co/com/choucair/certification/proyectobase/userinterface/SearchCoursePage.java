package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona certificaciones choucair").
            located(By.xpath("//*[@id='certificaciones']/a/img"));

    public static final Target INPUT_COURSE = Target.the("Buscar el curso").
            located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso").
            located(By.xpath("//*[@id='coursesearch']/fieldset/button"));

    public static final Target NAME_COURSE = Target.the("Da click para seleccionar el curso").
            located(By.xpath("//a[contains(text(), 'Foundation Level')]"));
}
