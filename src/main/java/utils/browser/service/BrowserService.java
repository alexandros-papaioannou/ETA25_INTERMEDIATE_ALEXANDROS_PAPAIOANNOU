package utils.browser.service;

import utils.DriverXmlReader;

public interface BrowserService {

    void openBrowser(DriverXmlReader driverXmlReader);

    Object getBrowserOptions(DriverXmlReader driverXmlReader);
}
