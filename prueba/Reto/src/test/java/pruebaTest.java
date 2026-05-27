import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class pruebaTest {

    public WebDriver driver;

    public WebDriverWait wait;

    page page;

    @Before
    public void setUp() {
        page = new page(driver);
        driver = page.chromeconnection();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        page.visit("http://localhost:4200/")  ;


    }

    @After
    public void tearDown() throws Exception {
        // CERRAR EL DRIVER DESPUES DE CADA PRUEBA

        /**  if (driver != null) {
         driver.quit();
         }
         */
    }

    @Test
    public void test() {

        page.ingresoSistema();


        Assert.assertTrue(
                "El ingreso al sistema s realizo correctamente",
                true
        );

        page.PantallaPrincipal();
        Assert.assertTrue(
                "Usuario ingresado correctamente",
                true
        );

        page.IniciarSesion();
        Assert.assertTrue(
                "El ingreso al sistema s realizo correctamente",
                true
        );

        page.Etiquetas();
        Assert.assertTrue(
                "El ingreso al sistema s realizo correctamente",
                true

        );
        page.PAGINAcurso();
        Assert.assertTrue(
                "El ingreso al sistema s realizo correctamente",
                true
        );
        page.Opcionajustes();
        Assert.assertTrue(
                "El ingreso al sistema s realizo correctamente",
                true
        );


}
}
