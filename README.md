Online Shopping System
Overview
The Online Shopping System is a Java-based GUI application that simulates an online shopping experience. It includes features such as user registration, login, product browsing, shopping cart management, and order placement.

Features
User Registration:
Users can register with a unique username, password, name, and email.
Input validations ensure the correctness of user-provided information.
User Login:
Registered users can log in using their credentials.
Once logged in, users can access personalized features.
Product Browsing:
Users can browse a catalog of products.
Product details, including name, price, description, and quantity in stock, are displayed.
Shopping Cart Management:
Users can add products to their shopping cart.
The shopping cart displays added items and the total price.
Order Placement:
Users can place orders, simulating a purchase.
The application processes payment (mocked) and updates the order status.

Setup
Prerequisites
Java Development Kit (JDK)
Eclipse IDE (or any Java IDE of your choice)
Git (for cloning the repository)



Project Setup 
Clone the Repository:
Open Eclipse and clone your project repository into your Eclipse workspace.
git clone https://github.com/your-username/online-shopping-system-gui.git
Import Project:
Open Eclipse, go to File -> Import -> General -> Existing Projects into Workspace. Select the root directory of your cloned project.

Compile and Run:
Right-click on MainClassGUI.java in the thirdproject package.
Select Run As -> Java Application.

Usage in Eclipse
Launching the GUI:
The GUI application should launch within Eclipse.
Interacting with the GUI:
Use the provided buttons for user registration, login, product browsing, cart operations, and order placement.
Dialog boxes will guide you through each operation.
Exit:
Close the GUI window to exit the program.

Project Structure
thirdproject.MainClassGUI: Main entry point for the GUI-based Online Shopping System.
thirdproject.UserAuthentication: Manages user registration and login.
thirdproject.Catalog: Represents the catalog of available products.
thirdproject.ShoppingCart: Manages the shopping cart functionality.
thirdproject.ProductLoader: Loads products into the catalog from an external source.
thirdproject.Product: Represents a product in the system.
thirdproject.Logger: Simple logger for user events.
thirdproject.PaymentProcessor: Simulates payment processing.
thirdproject.Order: Represents an order with order placement logic.
