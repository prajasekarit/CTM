Feature: ENERGY QUOTE Navigation Test


Scenario Outline: Validate The page navigation for Your supplier page

Given Initialize the <browser> browser
And Navigate to <url> Site
When Energy Quote page is launched
Then Enter the <valid> Post code
And Select the Mandatory fields in the Your Supplier Page and click Next
Then Verify the Page is navigate to the Your Energy details


Examples:
|browser	|url	|valid	|
|chrome	|https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT	|PE2 6YS	|

Scenario Outline: Validate The page navigation for Your Energy page

Given Navigated to Your Energy page
When I clicked on the Next button
Then Verify the <error> message is populated in the bottem of the page and
When Amount field is selected
Then Verify that "What is the date on your bill?" should get displayed
When Economy Meter selected as Yes and kWH is selected
Then Verify Day time and Night time electricity usage menu should get displayed
When Economy Meter selected as "No" and kWH is selected
Then Verify only one reading box should get displayed


Examples:
|error	|
|Complete this section to continue 1 question remaining	|
 
