# Lab G — State Machines with Enums
## Objective
Build a Java program that models a real-world system using an enum for state and enforces legal state transitions through methods.

## Scenario (Choose ONE)
Pick ONE of the following systems:
- Device Checkout
  - States: AVAILABLE, CHECKED_OUT, MAINTENANCE, RETIRED
- Support Ticket
  - States: NEW, IN_PROGRESS, WAITING_ON_CUSTOMER, RESOLVED, CLOSED
- Account Status
  - States: ACTIVE, LOCKED, DISABLED

## Requirements
1) Create an enum for the states

Example:
```
public enum TicketStatus { NEW, IN_PROGRESS, ... }
```
2) Create a class representing the item (Device/Ticket/Account)

Your class must include:
- **At least 3 fields** (example: id, name/title, status)
- A constructor
- ```toString()``` (or ```getSummary()```) that prints the object and its state
- A method that attempts a state change with validation, such as:
  - ```updateStatus(newStatus)```
  - ```transitionTo(newStatus)```
  - ```setStatus(newStatus)```

3) Enforce legal state transitions

You must **block invalid transitions**.

4) Track items in an ```ArrayList```

Create **at least 3 items** (hardcoded is fine for this lab).

5) Demonstrate transitions

Your program must:
- Print the list
- Attempt **at least 4 transitions**, including **2 invalid transitions**
- Print results of each transition attempt

## Deliverables
- All ```.java``` files
- Console output showing:
  - Initial list
  - Each transition attempt
  - “Allowed/Denied” messages

## Skills Practiced

✔ Enums

✔ Modeling system state

✔ Conditionals tied to state rules

✔ Collection iteration

✔ Writing “rules” in methods (not scattered logic)
