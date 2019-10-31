package pruebas;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba_Selenium2 {
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
        try {
            System.out.println("antes de las pruebas");
            driver.navigate().to("https://10.130.233.66/branch-account-open/forms/servlet/SmartForm.html?formCode=ao_login_r5");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='nominaEjecutivoLogin']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='nominaEjecutivoLogin']")).sendKeys("wd23213");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='ejecutivo_passwordEjecutivo']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='ejecutivo_passwordEjecutivo']")).sendKeys("12345678");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='nominaEjecutivoLogin']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='btn wdg-button']")).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath("//div[1]/div/div/div/div/div/button[@type='button']")).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath("//div/div/div/div/div/div/div/div[7]/div/div/div/button[@class='btn wdg-button']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='cliente_informacionPersonal_nombre']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='cliente_informacionPersonal_nombre']")).sendKeys("carlos");
            Thread.sleep(8000);
            driver.findElement(By.xpath("//input[@id='cliente_informacionPersonal_apellidoPaterno']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='cliente_informacionPersonal_apellidoPaterno']")).sendKeys("Perezooo");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='cliente_informacionPersonal_apellidoMaterno']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='cliente_informacionPersonal_apellidoMaterno']")).sendKeys("Perez");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='cliente_informacionPersonal_fechaNacimiento']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='cliente_informacionPersonal_fechaNacimiento']")).sendKeys("12121988");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='cliente_informacionPersonal_rfc']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='cliente_informacionPersonal_rfc']")).sendKeys("JOJO881212YR7");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='cliente_domicilio_calleCompleta']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='cliente_domicilio_calleCompleta']")).sendKeys("insurgentes sur 385");
            Thread.sleep(5000);
            //driver.findElement(By.xpath("//input[@id='cliente_domicilio_codigoPostal']")).click();
            //Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='cliente_domicilio_codigoPostal']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='cliente_domicilio_codigoPostal']")).sendKeys("09770");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='cliente_domicilio_calleCompleta']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div/div/div/div/div/div/div/div/div[2]/div/div/button[@class='btn wdg-button']")).click();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void prueba() {
        System.out.println("al ejecutar la prueba 1");

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
