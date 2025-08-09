Here’s a **`README.md`** for your `EcommerceAutomation` GitHub repo based on what you told me and what you’ve built.

---

```markdown
# 🛒 EcommerceAutomation

**EcommerceAutomation** is a Selenium + TestNG based automation testing project for an e-commerce website, with detailed HTML reports powered by **Extent Reports**.

## 📌 Features
- Automated functional tests for `https://automationexercise.com/`
- Product search and verification
- Add-to-cart workflow automation
- Mouse hover and scrolling actions
- Extent Reports integration for clear and shareable HTML reports
- Configurable TestNG XML for flexible test execution

## 🛠 Tech Stack
- **Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Test Framework:** TestNG
- **Build Tool:** Maven
- **Reporting:** Extent Reports
- **Version Control:** Git & GitHub

## 📂 Project Structure
```

EcommerceAutomation/
│
├── src/main/java        # Page Object Model (POM) classes and utilities
├── src/test/java        # Test classes
├── pom.xml              # Maven dependencies
├── testng.xml           # TestNG suite configuration
└── README.md

````

## 🚀 Getting Started

### 1️⃣ Prerequisites
- Java 8+ installed
- Maven installed
- Git installed
- Browser drivers (e.g., geckodriver for Firefox)

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/chandankumarnanand/EcommerceAutomation.git
cd EcommerceAutomation
````

### 3️⃣ Install Dependencies

```bash
mvn clean install
```

### 4️⃣ Run Tests

```bash
mvn test
```

or directly via TestNG:

```bash
mvn clean test -DsuiteXmlFile=testng.xml
```

## 📊 Reports

Extent Reports will be generated in:

```
test-output/ExtentReport.html
```

Open it in a browser to view detailed test execution results.

## 📎 Test Scenarios Covered

1. Verify that the home page is visible successfully
2. Navigate to **All Products** page
3. Search for a product and verify search results
4. Add product to cart and verify
5. Validate UI elements with mouse hover and scrolling

## 🤝 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

👨‍💻 **Author:** Chandan Kumar
🔗 **GitHub Repo:** [EcommerceAutomation](https://github.com/chandankumarnanand/EcommerceAutomation)

```

---

If you want, I can also add **screenshots of your Extent Report and test run** into the `README.md` so it looks visually appealing on GitHub.  
Do you want me to add that?
```
