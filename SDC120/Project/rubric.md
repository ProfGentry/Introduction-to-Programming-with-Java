# Final Project Grading Rubric (100 points)
## 1. Core Functionality — 35 points
This category answers one question: Does the program work as described?
- Menu & Program Flow (10 pts)
  - Menu displays clearly and loops correctly (5)
  - Exit option works without crashing (5)

- Hero Management (10 pts)
  - Heroes can be created via user input (5)
  - Heroes stored and displayed correctly from an ArrayList (5)

- Quest System (10 pts)
  - Heroes can be sent on quests (5)
  - Quest outcomes correctly update hero status and logs (5)

- Reports / Stats (5 pts)
  - Required stats display correctly
  - Counts and summaries are accurate

## 2. Object-Oriented Design — 25 points
This category measures how the program is built, not just whether it runs.
- Base Class Design (10 pts)
  - Base Character class is used correctly (5)
  - Encapsulation is applied (private fields + getters/setters) (5)

- Subclasses & Inheritance (10 pts)
  - At least two subclasses implemented (5)
  - Subclasses include unique fields and behavior (5)

- Polymorphism (5 pts)
  - Base-class references used (ArrayList<Character>)
  - Overridden methods behave differently by subclass

## 3. Game Skin System (Polymorphism in Practice) — 10 points
This category rewards clean separation between logic and presentation.
- Skin Selection (5 pts)
  -  Exactly one skin selected and used
  -  Program compiles and runs using the chosen skin

- Skin Integration (5 pts)
  - Output text uses GameSkin methods
  - No hardcoded theme text in game logic
  - Logic does not change based on skin choice

⚠️ Copy/pasting logic for different skins will lose points here.

## 4. Data Structures & State Management — 10 points
This category checks whether students understand why Java collections exist.
- ArrayList<Character> used correctly (5)
- Per-hero event log stored using ArrayList<String> (5)

## 5. Exception Handling & Input Validation — 10 points
This category reflects Chapter 11 skills and real-world robustness.
- Invalid menu input handled safely (4)
- Invalid hero selection handled gracefully (3)
- Invalid or impossible actions prevented (3)
- The program must not crash due to bad input.

## 6. Code Quality & Organization — 10 points
This is about professionalism, not perfection.
- Code is broken into methods (not everything in main) (5)
- Naming, formatting, and readability are clear (5)
Comments are encouraged but not required if code is readable.

### Submission Requirements — 5 points
- All .java files included (2)
- README.txt completed and accurate (2)
- Sample output included (1)

## Extra Credit (Optional) — up to +10 points
Extra credit is awarded only if the core project works.
Examples:
- Save/load heroes from a file (+5 to +10)
- Additional hero classes (+5)
- Quest types or difficulty levels (+5)
- Sorting heroes by level/status (+5)

### Grading Philosophy

A simple, correct, stable program scores higher than a broken complex one

Clean design beats clever hacks

Programs that crash under bad input will lose points

The goal is to show you understand Java fundamentals, not to build a full game
