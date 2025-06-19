package utils.browser.service;

import utils.DriverXmlReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeBrowserService implements BrowserService {

    private WebDriver driver;

    @Override
    public void openBrowser(DriverXmlReader driverXmlReader) {
        EdgeOptions edgeOptions = (EdgeOptions) getBrowserOptions(driverXmlReader);
        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
        driver.get(driverXmlReader.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Override
    public Object getBrowserOptions(DriverXmlReader driverXmlReader) {
        EdgeOptions edgeOptions = new EdgeOptions();
        if (!driverXmlReader.headless.isEmpty()) {
            edgeOptions.addArguments(driverXmlReader.headless);
        }
        edgeOptions.addArguments(driverXmlReader.resolution);
        edgeOptions.addArguments(driverXmlReader.gpu);
        edgeOptions.addArguments(driverXmlReader.extensions);
        return edgeOptions;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
