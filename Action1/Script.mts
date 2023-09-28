
 @@ script infofile_;_ZIP::ssf16.xml_;_

Dim email, password
email="nikola.ilic@q-sit.de"
password="nikolailic2023"
 @@ script infofile_;_ZIP::ssf1.xml_;_
SystemUtil.Run "msedge", "https://login.salesforce.com"
Browser("Login | Salesforce").Page("Login | Salesforce").WebEdit("username").Set email @@ script infofile_;_ZIP::ssf14.xml_;_
Browser("Login | Salesforce").Page("Login | Salesforce").WebEdit("pw").Set password @@ script infofile_;_ZIP::ssf2.xml_;_
Browser("Login | Salesforce").Page("Login | Salesforce").WebButton("Log In").Click @@ script infofile_;_ZIP::ssf3.xml_;_
wait(1)
Browser("Login | Salesforce").Page("Home | Salesforce").WebButton("View profile").Click @@ script infofile_;_ZIP::ssf15.xml_;_
Browser("Login | Salesforce").Page("Home | Salesforce").Link("Log Out").Click @@ script infofile_;_ZIP::ssf7.xml_;_
Browser("Login | Salesforce").Close
