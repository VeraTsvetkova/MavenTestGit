Scenario#1: Polici

Given I am  on  Home Page<frontUrl>
When I click on Vhod
And I fill my  <username>, <password> and I click the submit btn
And I click Polici
And I click Kasko
And I click Nova Oferta

Examples:
frontUrl|username|password|
http://192.168.4.63/webinacs/#/home|sm|blablaballs1|



--------------------------------------------------------

Scenario#2: Dobaviane na slujitel

Given I am  on  Home Page<frontUrl>
When I click on Vhod
And I fill my  <username>, <password> and I click the submit btn
When I click on Dobaviane na Slujitel
And I fill Slujitel ili Posrednik data  <egn>, <name>, <phone>, <mail>, <address>, <lk>, <date_lk>, <info> and I click SAVE btn

Examples:
frontUrl|username|password|egn|name|phone|mail|address|lk|date_lk|info|
http://192.168.4.63/webinacs/#/home|sm|blablaballs1|4603297606|testVera|12345|456|789|12345|31.05.2017|test info|

-------------------------------------------------------------

Scenario#3: Dobaviane na Posrednik
Given I am  on  Home Page<frontUrl>
When I click on Vhod
And I fill my  <username>, <password> and I click the submit btn
When I click on Dobaviane na Posrednik
And I fill Slujitel ili Posrednik data  <egn>, <name>, <phone>, <mail>, <address>, <lk>, <date_lk>, <info> and I click SAVE btn

Examples:
frontUrl|username|password|egn|name|phone|mail|address|lk|date_lk|info|
http://192.168.4.63/webinacs/#/home|sm|blablaballs1|9911135624|testVera|12342225|444|222|12345|31.05.2017|test info|

-------------------------------------------------------------------


Scenario#4: Generirane EGN

Given I am  on  Home Page<frontUrl>
When I Get Egn


Examples:
frontUrl|
http://georgi.unixsol.org/programs/egn.php|