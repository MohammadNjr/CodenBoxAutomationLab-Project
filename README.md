Selenium Automation Testing – Java & TestNG
 Project Overview

This project is a collection of automation testing examples built using Java, Selenium WebDriver, and TestNG.
It demonstrates common automation test scenarios, framework setup, and best practices used in real-world QA automation projects.

Tech Stack

Java

Selenium WebDriver

TestNG

Maven

ChromeDriver

IntelliJ IDEA / Eclipse 


📂 Project Structure

project-root
│
├── src
│   ├── main
│   │   └── java
│   └── test
│       └── java
│           └── testCases
│
├── pom.xml
├── testng.xml
└── README.md

⚙️ Prerequisites

Before running the project, make sure you have:

Java JDK 8 or higher

Maven

Google Chrome

ChromeDriver (compatible with your Chrome version)

IDE: IntelliJ IDEA or Eclipse

🚀 Project Setup
1️⃣ Clone the Repository
git clone https://github.com/your-username/your-repo-name.git

2️⃣ Open the Project

Open the project in IntelliJ IDEA or Eclipse

Make sure Maven dependencies are downloaded

📦 Maven Dependencies

The project uses Maven to manage dependencies.
Key dependencies included in pom.xml:

Selenium WebDriver

TestNG

WebDriverManager (optional but recommended)

Example:

<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.x.x</version>
    </dependency>

    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.x.x</version>
        <scope>test</scope>
    </dependency>
</dependencies>

▶️ Running the Tests
Option 1: Run via TestNG XML

Right-click testng.xml

Select Run

Option 2: Run via Test Class

Open any test class

Click Run on the @Test annotation

🧪 Test Examples Included

Browser setup and teardown

Element interaction (click, sendKeys, checkboxes, radio buttons)

Handling alerts, windows, and tabs

Basic waits and synchronization

TestNG annotations and assertions

📈 Purpose of This Project

Practice Selenium automation

Demonstrate Java + TestNG framework usage

Build a QA automation portfolio for job applications










