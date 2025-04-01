# Selenium Form Automation

This project uses Selenium WebDriver with Java and Maven to automate filling out a web-based job application form. It is based on the selenium-java-starter template and is designed to simulate real-world user input across various form elements.

## Features

- Opens the form page in a Chrome browser
- Fills in:
  - First and last name text fields
  - Gender and experience radio buttons
  - A date into a date picker field
  - Profession and tool checkboxes
  - Continent selection from a dropdown
  - Multiple selections from a commands dropdown
- Submits the form and logs success to the console
- Uses element validation (checks if elements exist before interacting)
- Submits the form
- Verifies successful submission (confirmation via terminal)
- Quits the browser at the end

## Quick Start

1. Clone the repo:
   ```bash
   git clone https://github.com/joshrod94/selenium-java-starter.git
2. Open in IntelliJ (or your IDE of choice).
3. Navigate to `FormAutomationDemo.java` in `src/main/java`
4. Run the `main()` method
5. Confirm that the form was filled out and submitted successfully by checking the terminal output or commenting out `driver.quit()` to see the browser window.

## Practice Site Used

- [Techlistic Selenium Practice Form](https://www.techlistic.com/p/selenium-practice-form.html)

## Technologies Used

- Java
- Selenium WebDriver
- Maven
- IntelliJ IDEA

## Requirements

    Java 23 (or higher)
    Maven 3.9.9+ ( you can check the latest version at https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java )
    (Optional) IntelliJ IDEA (this was created with Ultimate version 2024.2.3 ) 
    Selenium 4.30.0

## License

This project is licensed under the
[Creative Commons Attribution-NonCommercial 4.0 License](LICENSE). **This software is free for everyone**, except it cannot be used for commercial purposes. See `LICENSE` for details.
