# Lab H — Exception-Safe Menus & Input Recovery
## Objective
Build a menu-driven Java program that never crashes, even with repeated invalid input.

## Scenario
Create a menu-driven “utility” program with at least 4 options.

Example options:
- Add a name to a list
- Display list
- Remove an item by index
- Exit
(Any similar menu is fine.)

## Requirements
1) Menu loop must be stable
- Menu repeats until Exit
- Program never terminates unexpectedly

2) Handle invalid menu input

Must handle:
- Letters when a number is expected (e.g., abc)
- Blank input
- Out-of-range choices

3) Create an ```InputHelper``` class (or methods)

You must create reusable input methods such as:
- ```readIntInRange(prompt, min, max)```
- ```readNonEmptyString(prompt)```
- ```readYesNo(prompt)```

These must:
- Use ```try/catch```
- Re-prompt until valid

4) Demonstrate recovery from failure

Program must remain usable after:
- At least **5 invalid inputs** in a row
- A bad removal attempt (invalid index)

5) Data persistence

Use an ArrayList<String> so data persists between menu actions.

## Deliverables
- All ```.java``` files
- Console output that shows:
  - At least 3 valid actions
  - At least 5 invalid inputs handled
  - A successful recovery and continued operation

## Skills Practiced

✔ Exception handling (try/catch)

✔ Input validation patterns

✔ Defensive programming mindset

✔ Stable control flow with loops

✔ Collection operations (add/list/remove)
