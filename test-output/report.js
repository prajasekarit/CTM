$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/login.feature");
formatter.feature({
  "name": "GUMTREE GOOGLE Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate the GUMTREE links in Google Search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Initialize the \u003cbrowser\u003e browser",
  "keyword": "Given "
});
formatter.step({
  "name": "Navigate to \u003curl\u003e Site",
  "keyword": "And "
});
formatter.step({
  "name": "Google.com is launched send the literal \u003csearchterm\u003e in Google text box and Enter the search button",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the links with the Literal \u003csearch_GUM_TREE\u003e and confirm the number of links displayed is more than one",
  "keyword": "Then "
});
formatter.step({
  "name": "verify that the title is getting is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser",
        "url",
        "searchterm",
        "search_GUM_TREE"
      ]
    },
    {
      "cells": [
        "chrome",
        "https://google.com",
        "Cars in London",
        "GUM TREE"
      ]
    },
    {
      "cells": [
        "chrome-headless",
        "https://google.com",
        "Cars in London",
        "GUM TREE"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate the GUMTREE links in Google Search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Initialize the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.initialize_the_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to https://google.com Site",
  "keyword": "And "
});
formatter.match({
  "location": "steps.navigate_to_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Google.com is launched send the literal Cars in London in Google text box and Enter the search button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.googlecom_is_launched_send_the_literal_in_google_text_box_and_enter_the_search_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the links with the Literal GUM TREE and confirm the number of links displayed is more than one",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.verify_the_links_with_the_literal_and_confirm_the_number_of_links_displayed_is_more_than_one(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that the title is getting is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "steps.verify_that_the_title_is_getting_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.close_browsers()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the GUMTREE links in Google Search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Initialize the chrome-headless browser",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.initialize_the_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to https://google.com Site",
  "keyword": "And "
});
formatter.match({
  "location": "steps.navigate_to_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Google.com is launched send the literal Cars in London in Google text box and Enter the search button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.googlecom_is_launched_send_the_literal_in_google_text_box_and_enter_the_search_button(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: headless chrome\u003d79.0.3945.130)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027RAJARAJI\u0027, ip: \u0027192.168.0.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\RAJA\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:52197}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 105d622bca35ec4bf279c0ce2267d3ff\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat PageObjects.LoginPage.Searchterm(LoginPage.java:48)\r\n\tat stepDefinitions.steps.googlecom_is_launched_send_the_literal_in_google_text_box_and_enter_the_search_button(steps.java:62)\r\n\tat ✽.Google.com is launched send the literal Cars in London in Google text box and Enter the search button(file:Features/login.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Verify the links with the Literal GUM TREE and confirm the number of links displayed is more than one",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.verify_the_links_with_the_literal_and_confirm_the_number_of_links_displayed_is_more_than_one(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify that the title is getting is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "steps.verify_that_the_title_is_getting_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.close_browsers()"
});
formatter.result({
  "status": "skipped"
});
});