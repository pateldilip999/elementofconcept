package com.StepDefination;

import com.driverclass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class hooks {
    driverclass dclass = new driverclass();

    @Before
    public void open() throws IOException {
        dclass.openBrowser();
    }
    @After
    public void close() {
        dclass.closeBrowser();
    }
}
