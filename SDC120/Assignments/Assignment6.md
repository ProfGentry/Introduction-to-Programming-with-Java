# Assignment 6 — State-Based Object Manager

## Type: Programming Assignment
## Objective
Build a Java program that tracks and enforces **object state**.

## Instructions
Create a program that manages objects which move through **defined states**.

Choose ONE scenario:
- Device tracking (AVAILABLE, IN_USE, MAINTENANCE)
- Task tracking (NEW, IN_PROGRESS, COMPLETED)
- Account management (ACTIVE, LOCKED, DISABLED)

Your program must:
- Define an **enum** for valid states
- Create a **class** with:
  - Fields
  - Constructor
  - State field using the enum
- Use a **menu** to:
  - Create objects
  - Change object state
  - Display all objects
- Block **invalid state transitions**
- Store objects in an **ArrayList**

## Requirements
- State changes must happen through methods
- Illegal transitions must be prevented
- Program must not crash on invalid input

## Submission
- ```.java``` files
- Sample output showing both valid and invalid state attempts
