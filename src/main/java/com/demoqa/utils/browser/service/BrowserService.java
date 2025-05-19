package com.demoqa.utils.browser.service;

import com.demoqa.utils.DriverXmlReader;

public interface BrowserService {

    void openBrowser(DriverXmlReader driverXmlReader);

    Object getBrowserOptions(DriverXmlReader driverXmlReader);
}
