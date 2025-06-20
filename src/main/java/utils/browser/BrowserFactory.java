package utils.browser;

import utils.ConfigXmlReader;
import utils.XmlConfig;
import utils.browser.service.ChromeBrowserService;
import utils.browser.service.EdgeBrowserService;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class BrowserFactory {

    public WebDriver getBrowserOptions() {
        String isRemote = System.getProperty("isRemote");
        String browser = System.getProperty("browser").toLowerCase(Locale.ROOT);

        ConfigXmlReader configXmlReader = XmlConfig.createConfigXml(ConfigXmlReader.class);

        if (Boolean.parseBoolean(isRemote)) {
            configXmlReader.driverXmlReader.headless = "--headless=new";
        } else {
            browser = configXmlReader.driverXmlReader.localBrowser;
        }

        switch (browser) {
            case BrowserType.BROWSER_CHROME:
                ChromeBrowserService chromeService = new ChromeBrowserService();
                chromeService.openBrowser(configXmlReader.driverXmlReader);
                return chromeService.getDriver();
            case BrowserType.BROWSER_EDGE:
                EdgeBrowserService edgeService = new EdgeBrowserService();
                edgeService.openBrowser(configXmlReader.driverXmlReader);
                return edgeService.getDriver();
        }
        return null;
    }
}
