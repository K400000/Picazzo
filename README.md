# 🛒 Picazzo - Shopping System

<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=java&theme=light" height="50" alt="Java" />
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/netbeans/netbeans-original.svg" height="40" alt="NetBeans" style="margin: 0 5px;" />
    <img src="https://skillicons.dev/icons?i=git,github&theme=light" height="50" alt="Git & GitHub" />
  </a>
</p>

<p align="center">
  <b>Software Construction Mini Project</b> • <i>Department of Computer Science</i>
  <br>
  <br>
  <img src="https://img.shields.io/badge/License-Educational-green?style=flat-square" alt="License">
</p>

---

## 📖 Project Overview

**Picazzo** is a comprehensive desktop application designed to simulate a **Retail Grocery Store environment**. Built using **Java Swing**, this system demonstrates the core principles of software construction, object-oriented programming (OOP), and user interface design.

This project was developed as a **Mini Project** for the **Software Construction** course. It aims to replicate a real-world **retail ecosystem**, covering everything from user authentication and product inventory management to the point-of-sale (POS) checkout process.

The system utilizes **Microsoft Excel (via Apache POI)** as a lightweight database solution to handle user credentials and transaction data, demonstrating file-based data persistence without the need for a complex SQL server setup.

---

## ✨ Key Features

### 🔐 1. Authentication & Security
* **User Registration:** Secure sign-up process with email format validation.
* **Secure Login:** Access control system for authorized users.
* **Password Recovery:** PIN-based verification system for resetting passwords.

### 🏪 2. Retail & Inventory Management
* **Categorized Browsing:** Organized product catalog including Fresh Food, Fruits & Vegetables, Snacks, Dry Food, Frozen Food, and Beverages.
* **Real-time Inventory:** Displays current stock levels, simulating a real retail stock system where items decrease upon purchase.
* **Visual Interface:** High-quality images and clear pricing for a seamless user experience.

### 🛒 3. Cart & Checkout (POS)
* **Dynamic Shopping Cart:** Add/remove items and adjust quantities with real-time total calculation.
* **Order Processing:** Delivery address input and transaction summary.
* **Payment Simulation:** Integrated QR Code payment interface.
* **Digital Receipt:** Generates an electronic receipt upon successful transaction.

---

## 🛠️ Technology Stack

This project is built using standard industry tools to ensure reliability and maintainability.

| Category | Technologies |
| :--- | :--- |
| **Language** | Java SE (JDK 8+) |
| **GUI Framework** | Java Swing (Standard Widget Toolkit) |
| **IDE** | NetBeans IDE |
| **Data Storage** | Microsoft Excel (.xlsx) via **Apache POI Library** |
| **Version Control** | Git & GitHub |

---

## 📂 Project Structure

The project follows a structured architecture (MVC-based) for maintainability:

```text
Picazzo/
├── src/
│   └── Picasso/
│       ├── gui/           # User Interface (View)
│       │   ├── auth/      # Login & Registration Screens
│       │   ├── shop/      # Product Browsing & Inventory
│       │   └── checkout/  # Cart & Payment Screens
│       ├── model/         # Data Models & Logic
│       └── utils/         # Utility Classes (Helpers)
├── resources/
│   └── Picasso/
│       └── images/        # Assets & Icons
└── data.xlsx              # Excel Database (Do not delete)
```

---

## 👥 Team Members
* **Mr. Supasin Khamphayae** - [GitHub Profile](https://github.com/K400000)
* **Mr. Piyakorn Kacharnont** - [GitHub Profile](https://github.com/Shiseko)
* **Mr. Kittichai Kuljaruhiran** - [GitHub Profile](https://github.com/kittikul00)
* **Mr. Mawin Boonsri** - [GitHub Profile](https://github.com/Mawinbosri)
* **Mr. Thanapat Kongprasert** - [Github Profile](https://github.com/ThanapatKong48)
