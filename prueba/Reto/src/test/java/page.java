import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page extends base {

    public page(WebDriver driver) {
        super(driver);
    }

    By FeedGlobal = By.xpath("/html/body/app-root/app-home-page/div/div[2]/div/div[1]/app-article-list/app-article-preview[1]/div/app-article-meta/div/app-favorite-button/button");
    By nombre_usuario = By.xpath("/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[1]/input");
    By Email = By.xpath("/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[2]/input");
    By contraseña = By.xpath("/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[3]/input");
    By btnIniciarSesion = By.xpath("/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/button");
    By Etiquetas = By.xpath("/html/body/app-root/app-home-page/div/div/div/div[2]/div/div[1]/a[9]");

    By Principiantes = By.xpath("/html/body/app-root/app-home-page/div/div/div/div[1]/app-article-list/app-article-preview[1]/div/a/ul/li[1]");
    By Favoritos = By.xpath("/html/body/app-root/app-article-page/div/div[1]/div/app-article-meta/div/span/app-favorite-button/button");
    By Comentario = By.xpath("/html/body/app-root/app-article-page/div/div[2]/div[3]/div/div/form/fieldset/div[1]/textarea");
    By Publicar = By.xpath("/html/body/app-root/app-article-page/div/div[2]/div[3]/div/div/form/fieldset/div[2]/button");
    By Expresion = By.xpath("/html/body/app-root/app-article-page/div/div[2]/div[3]/div/app-article-comment[1]/div/div[2]/a[1]/img");
    By Ajustes = By.xpath("/html/body/app-root/app-layout-header/nav/div/ul/li[3]/a");
    By CerrarSesion = By.xpath("/html/body/app-root/app-settings-page/div/div/div/div/button");

    public void ingresoSistema() {
        System.out.println("Bienvenido a nuestro sistema");
    }


    public void PantallaPrincipal() {

        click(FeedGlobal);
        System.out.println("Ingreso al sistema");




    }

    public void IniciarSesion() {
        insert("jhorman", nombre_usuario);
        System.out.println("Ingreso de usuario exitoso");

        insert("jhorman@gmail.com", Email);
        System.out.println("Ingreso de usuario exitoso");

        insert("jhorman1", contraseña);
        System.out.println("Ingreso de usuario exitoso");

        click(btnIniciarSesion);
        System.out.println("Ingreso de contraseña exitoso");

    }

    public void Etiquetas() {
        click(Etiquetas);
        System.out.println(" Javascript ");
        click(Principiantes);
        System.out.println(" Javascript ");

        }

        public void PAGINAcurso() {
            click(Favoritos);
            System.out.println(" Javascript ");
            insert("Mi primer curso", Comentario);
            System.out.println("Comentario Exitoso");
            click(Publicar);
            System.out.println(" Javascript ");
            click(Expresion);
            System.out.println(" Javascript ");
        }
            public void Opcionajustes() {
                click(Ajustes);
                System.out.println(" Javascript ");
                click(CerrarSesion);
                System.out.println(" Javascript ");


            }


        }









