# Selenium TestNG Automation Framework

A comprehensive Java-based automation testing framework using Selenium WebDriver and TestNG.

## 🚀 Features

- **Page Object Model (POM)** design pattern
- **TestNG** for test execution and reporting
- **ExtentReports** for beautiful HTML reports
- **WebDriverManager** for automatic driver management
- **Log4j2** for comprehensive logging
- **Maven** for dependency management
- **Parallel execution** support
- **Cross-browser testing** (Chrome, Firefox, Edge)
- **Screenshot capture** on test failures
- **Configuration management** via properties file

## 📁 Project Structure

```
selenium-testng-framework/
├── src/
│   ├── main/java/com/automation/
│   │   ├── base/
│   │   │   └── BaseTest.java
│   │   ├── pages/
│   │   │   ├── BasePage.java
│   │   │   ├── GoogleHomePage.java
│   │   │   └── GoogleSearchResultsPage.java
│   │   └── utils/
│   │       ├── ConfigReader.java
│   │       ├── DriverManager.java
│   │       ├── ExtentReportManager.java
│   │       └── WebElementUtils.java
│   └── test/
│       ├── java/com/automation/
│       │   ├── listeners/
│       │   │   └── TestListener.java
│       │   └── tests/
│       │       ├── GoogleSearchTests.java
│       │       └── SampleWebsiteTests.java
│       └── resources/
│           ├── config.properties
│           ├── testng.xml
│           └── log4j2.xml
├── pom.xml
└── README.md
```

## 🛠️ Prerequisites

- Java 11 or higher
- Maven 3.6 or higher
- Chrome/Firefox/Edge browser installed

## ⚡ Quick Start

### 1. Clone the Repository
```bash
git clone <repository-url>
cd selenium-testng-framework
```

### 2. Install Dependencies
```bash
mvn clean install
```

### 3. Run Tests
```bash
# Run all tests
mvn test

# Run specific test suite
mvn test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml

# Run with specific browser
mvn test -Dbrowser=chrome

# Run in headless mode
mvn test -Dheadless=true
```

## 🔧 Configuration

### Browser Configuration
Edit `src/test/resources/config.properties`:

```properties
browser=chrome          # chrome, firefox, edge
headless=false         # true for headless execution
base.url=https://www.google.com
```

### TestNG Configuration
Edit `src/test/resources/testng.xml` for:
- Test suites and classes
- Parallel execution settings
- Test parameters

## 📊 Reports

### ExtentReports
- Location: `test-output/ExtentReport_<timestamp>.html`
- Features: Test results, screenshots, logs, system info

### TestNG Reports
- Location: `test-output/index.html`
- Default TestNG HTML reports

### Logs
- Location: `logs/automation.log`
- Configurable via `log4j2.xml`

## 🧪 Writing Tests

### 1. Create Page Object
```java
public class LoginPage extends BasePage {
    @FindBy(id = "username")
    private WebElement usernameField;
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
    public void enterUsername(String username) {
        WebElementUtils.sendKeys(driver, By.id("username"), username);
    }
}
```

### 2. Create Test Class
```java
public class LoginTests extends BaseTest {
    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("testuser");
        // Add assertions
    }
}
```

## 🔄 Parallel Execution

Configure in `testng.xml`:
```xml
<suite name="ParallelSuite" parallel="methods" thread-count="3">
```

Options:
- `parallel="methods"` - Run test methods in parallel
- `parallel="classes"` - Run test classes in parallel
- `parallel="tests"` - Run test tags in parallel

## 📱 Cross-Browser Testing

Supported browsers:
- **Chrome** (default)
- **Firefox**
- **Edge**

Run with specific browser:
```bash
mvn test -Dbrowser=firefox
```

## 🐛 Debugging

### Enable Debug Logging
```properties
# In log4j2.xml
<Logger name="com.automation" level="DEBUG">
```

### Take Screenshots
```java
String screenshot = WebElementUtils.takeScreenshot(driver);
test.addScreenCaptureFromBase64String(screenshot, "Debug Screenshot");
```

## 🚀 CI/CD Integration

### GitHub Actions Example
```yaml
name: Selenium Tests
on: [push, pull_request]
jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v2
      - name: Set up JDK 11
        uses: actions/setup-java@v2
        with:
          java-version: '11'
      - name: Run tests
        run: mvn test -Dheadless=true
```

## 📚 Best Practices

1. **Use Page Object Model** for maintainable code
2. **Implement explicit waits** instead of Thread.sleep()
3. **Use meaningful test names** and descriptions
4. **Add proper assertions** with clear messages
5. **Capture screenshots** on failures
6. **Use data providers** for data-driven testing
7. **Implement proper logging** for debugging

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests for new features
5. Submit a pull request

## 📄 License

This project is licensed under the MIT License.

## 🆘 Support

For issues and questions:
1. Check the logs in `logs/automation.log`
2. Review ExtentReports for detailed test results
3. Enable debug logging for more information
4. Create an issue in the repository

## 🔗 Useful Links

- [Selenium Documentation](https://selenium.dev/documentation/)
- [TestNG Documentation](https://testng.org/doc/)
- [ExtentReports Documentation](https://extentreports.com/)
- [WebDriverManager](https://github.com/bonigarcia/webdrivermanager)