@tag
Feature:
As Admin users i want login to orange hrm
@Positivedata
Scenario Outline:
I want to test login with valid data
Given i open browser with url "http://orangehrm.qedgetech.com"
Then i should see login page
When i enter username as "<username>"
And i enter password as "<paasword>"
And i click login button
Then Login should be success
When i close browser
Examples:
|username|password|
|Admin|Qedge123!@#|
|Admin|Qedge123!@#|
|Admin|Qedge123!@#|
|Admin|Qedge123!@#|
|Admin|Qedge123!@#|
|Admin|Qedge123!@#|
@Negativedata
Scenario Outline:
I want to test login with valid data
Given i open browser with url "http://orangehrm.qedgetech.com"
Then i should see login page
When i enter username as "<username>"
And i enter password as "<paasword>"
And i click login button
Then i should see error message"<Errormessage>"
When i close browser
Examples:
|username|password|Errormessage|
|Admin|xyz|Invalid credentials|
|Admin||password can not be empty|
|Admin|Qedge123!@#|Username cannot be empty|

