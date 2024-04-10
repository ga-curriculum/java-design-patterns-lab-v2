# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Java design patterns lab

| Title                    | Type | Duration | Author               |
|--------------------------|------|----------|----------------------|
| Java design patterns lab | Lab  | 2:00     | Suresh Melvin Sigera |

## Learning objectives:

- Understand the concept of design patterns and their significance in software engineering.
- Recognize different categories of design patterns: creational, structural, and behavioral.
- Identify common design patterns used in Java development, such as Singleton, Factory Method, Abstract Factory, and
  Builder.
- Comprehend the intent, structure, and participants involved in each design pattern.
- Learn when and why to apply specific design patterns to solve recurring design problems in Java applications.
- Recognize the benefits and drawbacks of using design patterns, including considerations for performance, scalability,
  and maintainability.
- Gain hands-on experience in implementing design patterns by developing a simple inventory management system using
  appropriate design patterns.
- Demonstrate the ability to apply design patterns effectively to enhance the flexibility, scalability, and
  maintainability of software systems.

### Instructions:

Imagine you are tasked with designing a new system for managing inventory in a retail store. The system needs to handle
different types of products (e.g., electronics, clothing, groceries) and their respective attributes (e.g., price,
quantity, expiration date). Additionally, the system should support various operations such as adding new products,
updating inventory levels, and generating reports on sales and stock levels.

You are required to deliver the full source code for the inventory management system. Make sure to implement the system
using appropriate design patterns to ensure flexibility, scalability, and ease of maintenance.

Please provide the source code for all classes and interfaces required to implement the inventory management system. Be
sure to include any necessary comments or explanations to clarify your implementation.

**Here's an example of the expected output for the program**:

```text
Product added: Product{name='Smartphone', type='Electronics', price=599.99, quantity=10, expirationDate=Wed Apr 10 09:48:58 EDT 2024}
Product added: Product{name='T-shirt', type='Clothing', price=19.99, quantity=50, expirationDate=null}
Product added: Product{name='Milk', type='Groceries', price=2.99, quantity=20, expirationDate=Wed Apr 10 09:48:58 EDT 2024}
Inventory updated for Smartphone: New quantity = 8
Generating inventory reports...
Inventory Report:
-----------------------------------------------------------------------------------------
Name                 Type            Price ($)  Quantity   Expiration Date
-----------------------------------------------------------------------------------------
Smartphone           Electronics     599.99     8          Wed Apr 10 09:48:58 EDT 2024
T-shirt              Clothing        19.99      50         N/A            
Milk                 Groceries       2.99       20         Wed Apr 10 09:48:58 EDT 2024
-----------------------------------------------------------------------------------------
```

Please note that this output serves as a guideline for the kind of information your program should produce and report.
However, the exact formatting of the output, including alignment, spacing, and the representation of null values or
dates, is flexible and can be adjusted according to your implementation or preferences.

## How to submit homework

### Setup

- Step 1. Fork the repository
- Step 2. Clone your fork

### Submitting work

- Step 1. Create a folder for the specific homework
- Step 2. Push to your fork
- Step 3. Submit a pull request
- Step 3.1. Under the title, add your first and last name with the comment

In the comment section, you must add the following:

```text
* Comfortability [0 to 5]
* Completeness [0 to 5]
* What was a win?
* What was a challenge?
* Any other comments
```