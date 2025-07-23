# 📘 Employee Tax Report System

## 📄 Description
This Java-based application manages full-time and part-time employees by storing their details, calculating their taxes, and organizing them by department. It demonstrates core object-oriented concepts like inheritance, abstraction, interfaces, and polymorphism, alongside Java Collection APIs for sorting and grouping.

---

## 🧩 Components
- **Main.java** – Entry point; creates employee objects and triggers report generation.
- **Employee (Abstract Class)** – Base class for shared attributes like `id`, `name`, `dept`.
- **FullTimeEmployee** – Inherits from `Employee`; calculates fixed salary and tax (20%).
- **PartTimeEmployee** – Inherits from `Employee`; calculates salary by hours × rate and tax (10%).
- **Taxable (Interface)** – Declares `calculateTax()` method, implemented by all employee types.
- **TaxReportGenerator** – Provides methods to display, sort, group employees and compute tax summaries.

---

## 🎯 Purpose
To demonstrate key object-oriented programming principles and use Java collections effectively for:
- Storing and managing heterogeneous employee data
- Calculating individual and departmental taxes
- Organizing and presenting structured employee reports

---

## 🏗️ Design Highlights
- **Abstraction & Inheritance**: `Employee` is an abstract superclass extended by `FullTimeEmployee` and `PartTimeEmployee`.
- **Interface**: `Taxable` enforces consistent tax calculation behavior across employee types.
- **Collections**: Uses `List` for employee storage and `Map<String, List<Employee>>` for grouping.
- **Polymorphism**: Unified handling of different employee types via base class references.
- **Sorting**: Employees are sorted by descending tax value using Java's `Comparator`.

---

## 👤 Author
**Name**: *Lokeshwaran M*  
**Email**: *lokeshwaran.m@epssw.com*  
**Date**: July 2025
