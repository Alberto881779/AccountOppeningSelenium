package selenium;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.pages.ClienteNuevoi;
import selenium.pages.LogIn;

public class MainAccountOppening {
    static WebDriver driver = null;

    @BeforeClass
    public static void antes_de_todos() {
        System.out.println("AL INICIO DE LA CLASE");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before
    public void antes_de_la_prueba() {
            System.out.println("antes de las pruebas");
            LogIn logIn = new LogIn(driver);
            logIn.logIn();
    }

    @Test
    public void prueba() {
        System.out.println("al ejecutar la prueba 1");
        LogIn logIn = new LogIn(driver);
        ClienteNuevoi clienteNuevoi = new ClienteNuevoi(driver);
        logIn.tipoContrato();
        clienteNuevoi.formularioCteNuevo();
    }

    @After
    public void despues_de_la_prueba() {
        System.out.println("despues de la prueba");
    }

    @AfterClass
    public static void final_de_la_prueba() {
        try {
            System.out.println("FINAL DE  LA CLASE");
            Thread.sleep(5000);
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
