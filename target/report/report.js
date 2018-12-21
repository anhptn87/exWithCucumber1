$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/viettel/exWithCucumber/logInLazadaWithFaceBook.feature");
formatter.feature({
  "name": "log in",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "log in lazada with facebook",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginlazada"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am at lazada log in page",
  "keyword": "Given "
});
formatter.match({
  "location": "logInLazadaStepsDef.i_am_at_lazada_log_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Facebook button and enter my credentail",
  "keyword": "When "
});
formatter.match({
  "location": "logInLazadaStepsDef.i_click_on_Facebook_button_and_enter_my_credentail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can log in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "logInLazadaStepsDef.i_can_log_in_successfully()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of all elements located by By.xpath: //span[@id\u003d\u0027myAccountTrigger\u0027] (tried for 30 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027ADMIN\u0027, ip: \u0027172.20.10.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.45.615291 (ec3682e3c9061c..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:14270}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: bd0c5497442c7a2f64ff444efe38e333\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:113)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:283)\r\n\tat stepsDefinitions.logInLazadaStepsDef.i_can_log_in_successfully(logInLazadaStepsDef.java:43)\r\n\tat ✽.I can log in successfully(src/test/resources/viettel/exWithCucumber/logInLazadaWithFaceBook.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});