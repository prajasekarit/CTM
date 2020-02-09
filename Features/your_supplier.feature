Feature: ENERGY QUOTE Your Supplier page Validation

@Functional
Scenario Outline: Validate The Energy quote page Header and Title 

Given Initialize the <browser> browser
And Navigate to <url> Site
When Energy Quote page is launched
Then Verify the Header and Page Title
And Verify the sub header is displayed
Then Close Browsers

Examples:
|browser	|url	|
|chrome	|https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT	|

@Functional
Scenario Outline: Validate The Energy quote page Been here Before part 

Given Initialize the <browser> browser
And Navigate to <url> Site
When Energy Quote page is launched
Then Verify the been here before text
And Verify the previous energy quotes string is navigating to Sign in page
And Verify the How to get Started is clikable and expanding the display portion with details
Then Close Browsers

Examples:
|browser	|url	|
|chrome	|https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT	|

@Functional
Scenario Outline: Validate The Energy quote page Been here Before part 

Given Initialize the <browser> browser
And Navigate to <url> Site
When Energy Quote page is launched
Then Verify the Your current supplier text
When User clicks on the Find postcode button without any text
Then Verify that Error message is not getting displayed
When User clicks on the Find postcode button with <Inv_postcode> which is Invalid
Then Verify the Error message populated
When User clicks on the Find postcode button with <crct_postcode> which is valid
Then Verify that button is changed to the <Button> 
Then Close Browsers

Examples:
|browser	|url	|Inv_postcode	|crct_postcode	|
|chrome	|https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT	|625523	|PE2 6YS	|


@Functionala
Scenario Outline: Validate The Energy quote page Error Message

Given Initialize the <browser> browser
And Navigate to <url> Site
When Energy Quote page is launched
Then I clicked on the Next buton
And Verify the <error> message is populated in the bottem of the page
Then Close Browsers

Examples:
|browser	|url	|error	|
|chrome	|https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT	|Complete postcode question to continue	|
