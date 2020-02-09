$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/end_to_end.feature");
formatter.feature({
  "name": "ENERGY QUOTE Navigation Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate The page navigation for Your supplier page",
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
  "name": "Energy Quote page is launched",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the \u003cvalid\u003e Post code",
  "keyword": "Then "
});
formatter.step({
  "name": "Select the Mandatory fields in the Your Supplier Page and click Next",
  "keyword": "And "
});
formatter.step({
  "name": "Verify the Page is navigate to the Your Energy details",
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
        "valid"
      ]
    },
    {
      "cells": [
        "chrome",
        "https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT",
        "PE2 6YS"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate The page navigation for Your supplier page",
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
  "location": "Steps.initialize_the_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT Site",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.navigate_to_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Energy Quote page is launched",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.energy_quote_page_is_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the PE2 6YS Post code",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_the_post_code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the Mandatory fields in the Your Supplier Page and click Next",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_the_mandatory_fields_in_the_your_supplier_page_and_click_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Page is navigate to the Your Energy details",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.verify_the_page_is_navigate_to_the_your_energy_details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate The page navigation for Your Energy page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Navigated to Your Energy page",
  "keyword": "Given "
});
formatter.step({
  "name": "I clicked on the Next button",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the \u003cerror\u003e message is populated in the bottem of the page and",
  "keyword": "Then "
});
formatter.step({
  "name": "Amount field is selected",
  "keyword": "When "
});
formatter.step({
  "name": "Verify that \"What is the date on your bill?\" should get displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "Economy Meter selected as Yes and kWH is selected",
  "keyword": "When "
});
formatter.step({
  "name": "Verify Day time and Night time electricity usage menu should get displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "Economy Meter selected as \"No\" and kWH is selected",
  "keyword": "When "
});
formatter.step({
  "name": "Verify only one reading box should get displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "error"
      ]
    },
    {
      "cells": [
        "Complete this section to continue 1 question remaining"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate The page navigation for Your Energy page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigated to Your Energy page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.navigated_to_your_energy_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinitions.Steps.navigated_to_your_energy_page(Steps.java:210)\r\n\tat ✽.Navigated to Your Energy page(file:Features/end_to_end.feature:20)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I clicked on the Next button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_clicked_on_the_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the Complete this section to continue 1 question remaining message is populated in the bottem of the page and",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.verify_the_message_is_populated_in_the_bottem_of_the_page_and(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Amount field is selected",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.amount_field_is_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that \"What is the date on your bill?\" should get displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.verify_that_something_should_get_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Economy Meter selected as Yes and kWH is selected",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.economy_meter_selected_as_yes_and_kwh_is_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Day time and Night time electricity usage menu should get displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.verify_day_time_and_night_time_electricity_usage_menu_should_get_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Economy Meter selected as \"No\" and kWH is selected",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.economy_meter_selected_as_something_and_kwh_is_selected(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify only one reading box should get displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.verify_only_one_reading_box_should_get_displayed()"
});
formatter.result({
  "status": "skipped"
});
});