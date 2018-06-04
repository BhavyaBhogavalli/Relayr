# Relayr
Test Cases for https://www.makemytrip.com website 

Implementation steps:

•	I’ve created the maven project using commands through command prompt and connected this project to eclipse using commands through command prompt
•	And imported this Maven project to Eclipse
•	I’ve created the TC’s under src/test/java, 
  I’ve created the page objects under src/main/java/page objects
  I’ve created the basic browser validations, properties file,log4j file under src/main/java/resources
•	I’ve updated the POM.xml with dependencies(selenium,log4j,TestNG) and edited the file with testing suite XML resources, log4j resources
•	I’ve created the TestNG XML file
•	Then I’ve executed the TC’s using Maven commands (mvn compile) and (mvn test) through command prompt
•	I’ve validated the results in logs folder and test-output/index.html path
  For continuous integration, we can even try Jenkins(I didn’t use this for my project to make it simple)
