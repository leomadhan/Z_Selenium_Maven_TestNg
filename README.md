# Z_Selenium-Maven-TestNG-Retry-Automation

A Autmation framework based on Page Object Model, Selenium, TestNG using Java.

This framework is based in **Page Object Model (POM).**

The framework uses:

1. Java
2. Selenium
3. TestNG
4. ExtentReport
5. Log4j
6. SimpleJavaMail
7. Retry

Test cases:
----
Let's say we want to automate flight Booking test.  

1. AmazonHomePage in **pages** package.(src\test\java\example\example\pages)  
  A page class typically should contain all the elements that are present on the page and corresponding action methods.
  
2. The AmazonSearchTest test class which class the methods

3.Add the test class in testng.xml file under the folder `src/test/resources/suites/`

```
<suite name="Suite">
	<listeners></listeners>
	<test thread-count="5" name="Test" parallel="classes">
		<classes>
			<class name="example.example.tests.AmazonSearchTest" />
```
4.Execute the maven command `mvn clean test` or right click on pom.xml and select Run as "Maven Clean"

5.Run test case by right click on pom.xml and select Run as "Maven Install"
---

Reproting
---
The framework gives report in three ways,

1. Log - In file `logfile.log`.
2. A html report - Which is generated using extent reports, under the folder `ExtentReports`.

---

By MMM