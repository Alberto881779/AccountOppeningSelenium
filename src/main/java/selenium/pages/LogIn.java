package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {
    WebDriver driver = null;

    public LogIn(WebDriver driver) {
        this.driver = driver;
    }

    public void logIn() {
        try {
            By txtUsuario = By.xpath("//input[@id='nominaEjecutivoLogin']");
            By txtPassword = By.xpath("//input[@id='ejecutivo_passwordEjecutivo']");
            By btnLogin = By.xpath("//button[@class='btn wdg-button']");
            driver.navigate().to("https://10.130.233.66/branch-account-open/forms/servlet/SmartForm.html?formCode=ao_login_r5");
            espera(txtUsuario);
            driver.findElement(txtUsuario).click();
            driver.findElement(txtUsuario).sendKeys("wd23213");
            espera(txtPassword);
            driver.findElement(txtPassword).click();
            driver.findElement(txtPassword).sendKeys("12345678");
            espera(btnLogin);
            driver.findElement(txtUsuario).click();
            Thread.sleep(2000);
            driver.findElement(btnLogin).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tipoContrato(){
        try{
            By btnTradicional = By.xpath("//div[1]/div/div/div/div/div/button[@type='button']");
            By btnNoescliente = By.xpath("//div/div/div/div/div/div/div/div[7]/div/div/div/button[@class='btn wdg-button']");
            By txtNombre = By.xpath("//input[@id='cliente_informacionPersonal_nombre']");
            espera(btnTradicional);
            driver.findElement(btnTradicional).click();
            espera(btnNoescliente);
            driver.findElement(btnNoescliente).click();
            espera(txtNombre);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void espera(By element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
