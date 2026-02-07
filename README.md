# Picazzo - Grocery Shopping System

A desktop-based e-commerce application for grocery shopping built with Java Swing. This system provides a complete shopping experience including user authentication, product browsing, shopping cart management, and checkout process.

## Team Members

1. **John Doe** - Project Lead & Backend Developer
2. **Jane Smith** - UI/UX Designer & Frontend Developer
3. **Michael Johnson** - Database Administrator
4. **Sarah Williams** - Quality Assurance & Testing
5. **David Brown** - Documentation & System Analyst

## Technologies Used

### Core Technologies
- **Java SE** - Main programming language
- **Java Swing** - GUI framework for desktop application
- **Apache POI** - Excel file manipulation for data storage

### Development Tools
- **NetBeans IDE** - Primary development environment
- **Git** - Version control system

## Features

### 🔐 User Authentication
- User registration with email validation
- Secure login system
- Password recovery with PIN verification
- User data persistence in Excel format

### 🛒 Shopping System
- Browse products across multiple categories:
  - Fresh Food
  - Fruits & Vegetables
  - Snacks
  - Dry Food
  - Frozen Food
  - Beverages
- Product images and pricing information
- Real-time inventory display

### 🛍️ Shopping Cart
- Add/remove items from cart
- Adjust product quantities
- Real-time price calculation
- Persistent cart across sessions

### 💳 Checkout Process
- Delivery address input form
- QR code payment integration
- Order receipt generation
- Transaction summary

## Project Structure

```
Picazzo/
├── src/
│   └── Picasso/
│       ├── gui/
│       │   ├── auth/          # Authentication screens
│       │   ├── shop/          # Product browsing screens
│       │   └── checkout/      # Checkout process screens
│       ├── model/             # Data models
│       └── utils/             # Utility classes
├── resources/
│   └── Picasso/
│       └── images/            # Product and UI images
└── data.xlsx                  # User and product database
```

## Setup Instructions

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- NetBeans IDE (recommended) or any Java IDE
- Apache POI library

### Installation Steps

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd Picazzo
   ```

2. **Import the project**
   - Open NetBeans IDE
   - File → Open Project
   - Select the Picazzo folder

3. **Add Apache POI library**
   - Right-click on the project → Properties
   - Libraries → Add JAR/Folder
   - Add Apache POI JAR files

4. **Verify data file**
   - Ensure `data.xlsx` exists in the project root
   - This file stores user accounts and product information

5. **Run the application**
   - Right-click on `Picasso.gui.auth.Authenticator`
   - Run File

## Usage

1. **First Time Users**
   - Click "Sign Up" on the login screen
   - Enter email and password
   - Confirm password and submit

2. **Existing Users**
   - Enter email and password
   - Click "Login"

3. **Shopping**
   - Browse categories using navigation buttons
   - Click on product images to add items to cart
   - Adjust quantities as needed

4. **Checkout**
   - Review cart contents
   - Enter delivery address
   - Complete payment via QR code
   - Receive digital receipt

## Data Storage

The application uses Excel (`.xlsx`) format for data persistence:
- **Sheet1**: User accounts (Email, Password, etc.)
- Product information is embedded in the code

## Known Issues

- Image paths may need adjustment based on deployment location
- Excel file must be closed before running the application
- Single-user mode (no concurrent access to data file)

## Future Enhancements

- Migration to database system (MySQL/PostgreSQL)
- Multi-language support
- Order history tracking
- Admin panel for product management
- Payment gateway integration

## License

This project is developed for educational purposes.

## Contact

For questions or feedback, please contact the development team.

---

**Last Updated**: February 2026
