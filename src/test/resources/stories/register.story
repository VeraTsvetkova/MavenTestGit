Scenario#3: Dobaviane na Posrednik



Given I am  on  Home Page<frontUrl>
When I Get Egn
Given I am  on  Generate EGN Page
When I click on Vhod
And I fill my  <username>, <password> and I click the submit btn
When I click on Dobaviane na Slujitel
And I fill Slujitel ili Posrednik data  <address>, <lk>, <date_lk>, <info> and I click SAVE btn

Examples:
frontUrl|frontUrlt|username|password|address|lk|date_lk|info|
http://georgi.unixsol.org/programs/egn.php|http://external.euroins.bg/webinacsrelease/#/home|sm|blablaballs1|Sofia|123452222|31.05.2017|test info|










