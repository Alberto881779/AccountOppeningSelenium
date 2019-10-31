package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClienteNuevoi {
    WebDriver driver = null;

    public ClienteNuevoi (WebDriver driver){
        this.driver = driver;
    }

    public void formularioCteNuevo(){
        try {
            By txtNombre = By.xpath("//input[@id='cliente_informacionPersonal_nombre']");
            By txtapellidoPaterno = By.xpath("//input[@id='cliente_informacionPersonal_apellidoPaterno']");
            By txtapellidoMaterno = By.xpath("//input[@id='cliente_informacionPersonal_apellidoMaterno']");
            By txtfechadeNacimiento = By.xpath("//input[@id='cliente_informacionPersonal_fechaNacimiento']");
            By txtRFC = By.xpath("//input[@id='cliente_informacionPersonal_rfc']");
            By txtcalleCompleta = By.xpath("//input[@id='cliente_domicilio_calleCompleta']");
            By txtcodigoPostal = By.xpath("//input[@id='cliente_domicilio_codigoPostal']");
            By btnIniciar =By.xpath("//div/div/div/div/div/div/div/div/div[2]/div/div/button[@class='btn wdg-button']");
            driver.findElement(txtNombre).click();
            driver.findElement(txtNombre).sendKeys("carlos");
            espera(txtapellidoPaterno);
            driver.findElement(txtapellidoPaterno).click();
            driver.findElement(txtapellidoPaterno).sendKeys("Perezooo");
            espera(txtapellidoMaterno);
            driver.findElement(txtapellidoMaterno).click();
            driver.findElement(txtapellidoMaterno).sendKeys("Perez");
            espera(txtfechadeNacimiento);
            driver.findElement(txtfechadeNacimiento).click();
            driver.findElement(txtfechadeNacimiento).sendKeys("12121988");
            espera(txtRFC);
            driver.findElement(txtRFC).click();
            driver.findElement(txtRFC).sendKeys("JOJO881212YR7");
            espera(txtcalleCompleta);
            driver.findElement(txtcalleCompleta).click();
            driver.findElement(txtcalleCompleta).sendKeys("insurgentes sur 385");
            espera(txtcodigoPostal);
            Thread.sleep(2000);
            driver.findElement(txtcodigoPostal).click();
            Thread.sleep(2000);
            driver.findElement(txtcodigoPostal).click();
            driver.findElement(txtcodigoPostal).sendKeys("09770");
            Thread.sleep(2000);
            driver.findElement(txtcalleCompleta).click();
            driver.findElement(btnIniciar).click();
            Thread.sleep(2000);
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
