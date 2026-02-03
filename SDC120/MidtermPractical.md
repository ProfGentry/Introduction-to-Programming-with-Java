# Midterm Exam - Practical 

Time: ~90 minutes

## Objective
Write a working Java program that demonstrates core skills from Weeks 1–3.

## Requirements
Students must:
- Create at least one class
- Use an ArrayList to store objects
- Implement a menu
- Use methods to:
  - Add data
  - Display data
- Handle invalid input safely

Constraints:
- No internet
- IDE allowed
- Notes optional (instructor call)

## Grading Focus
- Program runs
- Meets requirements
- Clean structure
- Reasonable logic

## What You’re Testing
- Not speed.
- Not cleverness.
- You’re testing: Can you build something that works?

# Grading Rubric
1. Program Functionality — 30 points
This category answers: Does the program actually work?
- Menu & Program Flow (10 pts)
  - Menu displays clearly and loops correctly (5)
  - Exit option works and terminates cleanly (5)
- Required Features Work (20 pts)
  - Objects can be added successfully (10)
  - Objects can be listed/displayed correctly (10)
Notes
- Program must run without crashing
- Output does not need to be fancy—correct matters more than pretty

2. Class & Object Design — 25 points
This category checks whether the student understands objects, not just syntax.
- Class Definition (10 pts)
  - Separate class created (not everything in one file) (5)
  - Class has appropriate fields and a constructor (5)
- Encapsulation & Representation (10 pts)
  - Fields represent meaningful data (5)
  - Object data displayed cleanly (via toString() or equivalent) (5)
- Object Usage (5 pts)
  - Objects are instantiated using new
  - Multiple objects can exist simultaneously

3. Use of Collections (ArrayList) — 20 points

This category evaluates Chapter 7 skills.

- ArrayList Usage (10 pts)
  - Uses ArrayList<SomeClass> correctly (5)
  - Objects are added dynamically at runtime (5)
- Iteration & Access (10 pts)
  - Loops through the collection to display objects (5)
  - Collection behaves correctly as it grows (5)
- Deductions
  - Raw types (ArrayList without generics): −3
  - Using multiple individual variables instead of a collection: −5 to −10

4. Methods & Program Structure — 15 points

This category checks Chapter 6 mastery.
- Method Decomposition (10 pts)
  - Logic is broken into methods (not all in main) (5)
  - Methods have clear, focused responsibilities (5)
- Readability & Naming (5 pts)
  - Method and variable names are meaningful
  - Code is reasonably easy to follow

5. Input Handling & Stability — 10 points

This category answers: Will this survive a real user?
- Input Handling (5 pts)
  - Accepts user input correctly
  - Handles invalid input without crashing
- Program Stability (5 pts)
  - No infinite loops
  - No unhandled exceptions during normal use
