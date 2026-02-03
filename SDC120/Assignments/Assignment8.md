# Assignment 8 — Extensible Program Design
## Objective
Design a Java program that supports **variation through polymorphism**, not conditional sprawl.

## Instructions

Create a program that models **multiple types of related objects** that share common behavior but differ in implementation.

Choose ONE context:
- Employees (HourlyEmployee, SalariedEmployee)
- Vehicles (Car, Truck, Motorcycle)
- Notifications (EmailNotification, SMSNotification, PushNotification)
- Accounts (CheckingAccount, SavingsAccount)

Your program must:
- Define a **base class** or **interface**  
  - At least one abstract method or method meant to be overridden
- Define **at least two subclasses**
  - Each overrides behavior differently
- Store objects using:
  - ```ArrayList<BaseType>```
- Use a menu to:
  - Create objects of different types
  - Perform an action that behaves differently per type
- Demonstrate polymorphism
  - The same method call produces different results depending on object type

## Requirements
- No large ```if/else``` blocks checking object type
- Polymorphic behavior must be achieved through overriding
- Program must not crash on invalid input

## Submission
- ```.java``` files
- Sample output demonstrating different behaviors for different object types

## Skills Practiced

✔ Inheritance or interfaces

✔ Method overriding

✔ Polymorphism

✔ Clean extensible design

✔ Collections of base types
