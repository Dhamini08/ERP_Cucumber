@tag
Feature: Validate supplier module
@tag1
Scenario Outline: As admin user i want to add multiple suppliers
Given  Launch browser
When Launch url "http://webapp.qedgetech.com/login.php"
When wait for username with "name" and "username"
When enter username with "xpath" and "//input[@id='username']" and "admin"
When enter password with "xpath" and "//input[@id='password']" and "master"
When click login button with "xpath" and "//button[@id='btnsubmit']" 
When wait for supplier link with "xpath"and "(//a[contains(.,'Suppliers')])[1]" 
When click on supplier link with "xpath" and "(//a[contains(.,'Suppliers')])[1]"
When wait for add icon with "xpath" and "(//span[@data-caption='Add'])[1]"
When clickon add icon with "xpath" and "(//span[@data-caption='Add'])[1]"
When wait for supplier number with "name" and "x_Supplier_Number"
When capture supplier number with "name" and "x_Supplier_Number"
When enter in "<SupplierName>" with "name" and "x_Supplier_Name"
When enter in "<Address>" with "name" and "x_Address"
When enter in "<City>" with "name" and "x_City"
When enter in "<Country>" with "name" and "x_Country"
When enter in "<ContactPerson>" with "name" and "x_Contact_Person"
When enter in "<PhoneNumber>" with "name" and "x_Phone_Number"
When enter in "<Email>" with "name" and "x__Email"
When enter in "<MobileNumber>" with "name" and "x_Mobile_Number"
When enter in "<Notes>" with "name" and "x_Notes"
When click add button with "id" and "btnAction"
When wait for confirm ok button with "xpath" and "//button[contains(.,'OK!')]"
When click confirm ok button with "xpath" and "//button[contains(.,'OK!')]"
When wait for alert ok button with "xpath" and "(//button[contains(.,'OK')])[6]"
When click alert ok button with "xpath" and "(//button[contains(.,'OK')])[6]"
Then verify supplier table
When close browser
Examples:
|SupplierName|Address|City|Country|ContactPerson|PhoneNumber|Email|MobileNumber|Notes|
|Priya|Jaganaickpur|Kakinada|India|Dhamini|7671866764|priyankadamini@gmail.com|656442234|Add Supplier|
|Riza|Mainroad|Kakinada|India|Dhamini|7671866765|priyankadamini@gmail.com|656442235|Add Supplier|
|Sadiya|Beachroad|Kakinada|India|Dhamini|7671866763|priyankadamini@gmail.com|656442238|Add Supplier|
|Priyanka|Gaati|Kakinada|India|Dhamini|7671866761|priyankadamini@gmail.com|656442237|Add Supplier|