package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that show us the form to login").
            located(By.xpath("//*[@id='nav-menu']/ul/li/a/strong[contains(text(), 'Ingresar')]"));

    public static final Target INPUT_USER = Target.the("where do w write the user").
            located(By.id("username"));

    public static final Target INPUT_PASSWORD = Target.the("were do we write the password").
            located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the("button to confirm login").
            located(By.xpath("//button[contains(@class, 'btn btn-primary')]"));
}
