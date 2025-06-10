(AMAZON CLONE)

This Java code implements a simple graphical user interface (GUI) application that simulates an Amazon-like shopping experience. The application allows users to view products, add them to a cart, and checkout.

Key Features:

1. Product Display: The application displays a list of products with their names and prices.
2. Add to Cart: Users can add products to a cart by clicking the "Add to Cart" button.
3. Cart Management: The cart displays the products added by the user, and users can checkout by clicking the "Checkout" button.
4. Checkout: During checkout, the application calculates the total cost of the products in the cart and displays a message with the total amount

Here's a project structure and README for the Amazon Clone Shopping Application:

Project Structure:

- src: Source code for the application
    - com/amazonclone: Package for the application
        - AmazonClone.java: Main class for the application
        - Product.java: Class representing a product
        - Cart.java: Class representing the shopping cart
        - Checkout.java: Class handling checkout functionality
- README.md: README file explaining the project structure and features
  
Features:-
- Product Display: Displays a list of products with their names and prices.
- Add to Cart: Allows users to add products to a cart.
- Checkout: Calculates the total cost of products in the cart and displays a checkout message.
- Error Handling: Handles errors and exceptions during user input and processing.
- Data Validation: Validates user input to ensure correct data format.

Project Structure:-
The project is structured into the following packages and classes:

- com.amazonclone: Package for the application
    - AmazonClone.java: Main class for the application
    - Product.java: Class representing a product
    - Cart.java: Class representing the shopping cart
    - Checkout.java: Class handling checkout functionality

Requirements:-
- Java 8 or later
- Java Swing library for GUI components

How to Run:-
1. Clone the repository using git clone https://github.com/username/amazon-clone.git
2. Navigate to the project directory using cd amazon-clone
3. Compile the application using javac src/com/amazonclone/*.java
4. Run the application using java src/com/amazonclone/AmazonClone

Future Enhancements:-
- User authentication and authorization
- Product categories and filtering
- Search functionality
- Product reviews and ratings
- Order tracking and history

README.md:-
AmazonClone/
├── AmazonClone.java # Main GUI class
├── README.md # Project description and usage
└── docs/
└── project_documentation.pdf # System design and flow

Features According to GUI-Based Projects Marking Rubric:-

Core Feature Implementation
- Add-to-cart system with real-time product list.
- Scrollable shopping cart view.
- Total price calculated at checkout.
- Simple static product database (hardcoded for demo purposes).

 Error Handling and Robustness
- String parsing is performed carefully to avoid crashes.
- Uses Swing's Event Dispatch Thread for GUI safety.
- Handles potential parsing errors with consistent logic structure.
- GUI structure avoids runtime exceptions by safe object initialization.

Integration of Components
- All UI components (header, product grid, shopping cart, checkout) are modularized.
- Panels productPane are structured with BorderLayout GridLayout
- Code integrates GUI elements with logic cleanly and efficiently.

 Event Handling and Processing
- Custom  ActionListener classes AddToCartActionListener CheckoutActionListener manage button clicks.
- Event flow is handled using Java’s event delegation model.
- Ensures clear separation of GUI and logic.

Data Validation
- Price strings are parsed and validated.
- Only valid strings are added to the cart.
- Total is calculated safely using Double.parseDouble() and formatted properly.

Code Quality and Innovative Features
- Javadoc-style class and method comments.
- Descriptive variable names and modular structure.
- Scrollable UI panels for both products and cart.
- Expandable product list using GridLayout

Prepare Project Documentation
A full PDF documentation is available under /docs/, which includes:
- UI architecture
- Event flow diagram
- Screenshot previews
- Limitations and possible future improvements
  
 Technologies Used:-
 Java 8+
Swing (JFrame, JPanel, JLabel, JButton, JScrollPane, JList)
Event Handling (ActionListener)
MVC-style modularization

 Possible Future Enhancements-
 
Connect to a real product database (e.g., SQLite)
Add product images and descriptions
Implement user authentication
Add Remove-from-Cart functionality
Documentation

Refer to the docs/project_documentation.pdf file for:-

AmazonClone/
├── AmazonClone.java
├── README.md
└── docs/
└── project_documentation.ppt


  





