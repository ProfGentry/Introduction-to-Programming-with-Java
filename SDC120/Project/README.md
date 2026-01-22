# Final Project Overview
## Weekly Checklist []
## Dungeon Ops: Console RPG Management System

### Project Type - Individual Programming Project (Java Console Application)
### Project Summary

In this project, you will build the backend logic for a small role-playing game (RPG) management system using Java.
This is not a graphical game. You are creating the game engine logic that manages characters, quests, and outcomes.

Your program will allow a user to:
- Recruit heroes
- Manage a party
- Send heroes on quests
- Resolve quest outcomes
- Track stats and reports

The goal is to demonstrate your understanding of Java fundamentals, object-oriented programming, and exception handling.

### Learning Objectives

By completing this project, you will demonstrate the ability to:
- Write a Java program that runs reliably from the console
- Use loops, conditionals, and methods to control program flow
- Create and use classes and objects
- Apply encapsulation (private fields with getters/setters)
- Implement inheritance and polymorphism
- Store and manage objects using ArrayList
- Handle invalid input using exceptions
- Design a program that models a real system

### Program Concept

You are building a Dungeon Operations System.

The system manages a roster of heroes who can be sent on quests.
Heroes gain experience, can be injured, and generate event logs based on quest outcomes.

Your Dungeon Ops project supports three game skins.
You will choose ONE skin and use its class to control how your game presents itself (names, text, flavor).

All skins implement the same interface, so your core game logic does not change.

## Skins (Choose ONE)
🧙 Fantasy Dungeon (Default)

Classic RPG party management in a dungeon world.

🚀 Space Crew Ops

Manage astronauts and missions aboard a space station.

🕶️ Cyberpunk Hacker Cell

Manage elite hackers running high-risk digital operations.

### How Skins Work (Important)

You will not rewrite your program for each skin

Your main program uses one skin object

The skin controls:
- Game title
- Character naming
- Quest wording
- Status messages

This is real-world polymorphism, not decoration.

### How to use the Skin (Example)
In Main.java (or equivalent):
```
GameSkin skin = new FantasyDungeonSkin();
// OR
// GameSkin skin = new SpaceCrewSkin();
// OR
// GameSkin skin = new CyberpunkHackerSkin();

System.out.println(skin.getGameTitle());
```

From there, all output text should reference skin, not hardcoded strings.

### Grading Note
- You must use exactly one skin
- You must use the skin object for output text
- Do not duplicate logic per skin

The goal is polymorphism, not copy/paste

### Why This Matters (Yes, This Is Real)

This is the same pattern used in:
- Game engines
- Theming systems
- UI localization
- Feature toggles
- White-labeled software

You’re not “just coding.”
You’re building flexible systems.

## Required Program Features
### Main Menu (Required)

Your program must display a menu that loops until the user exits.

Example:

1. Recruit Hero
2. View Party
3. Send Hero on Quest
4. Resolve Quest Outcome
5. View Stats / Reports
6. Exit

## Class Design Requirements
### Base Class (Required)

Character (or Hero)

Must include:
- Unique ID
- Name
- Level
- Health
- Status (Idle, On Quest, Injured, Retired)
- Event log (stored in an ArrayList of Strings)

Must include methods such as:
- getSummary() or toString()
- addEvent()
- levelUp() or similar

### Subclasses (Required)

You must implement at least two subclasses.

Examples (you may choose others):
- Warrior
- Mage
- Rogue
- Healer

Each subclass must:
- Extend the base class
- Add at least one unique field
- Override a method to demonstrate polymorphism

### Quest System Requirements

Your program must allow:
- Sending a hero on a quest
- Determining an outcome (success, partial success, failure)
- Updating hero status based on outcome
- Logging quest results in the hero’s event log

Quest logic may be simple (random or rule-based).

### Data Structures (Required)
- Heroes stored in an ArrayList<Character>
- Event log stored as ArrayList<String> per hero
- Exception Handling (Required)

Your program must safely handle:
- Invalid menu input (letters instead of numbers)
- Invalid hero ID selection
- Invalid values (negative numbers, empty names, etc.)
- Invalid actions (sending injured heroes on quests)

The program must not crash due to bad input.

### Reports / Stats Screen (Required)

Your program must include a stats option that displays:
- Total number of heroes
- Active vs injured vs retired heroes
- Count of heroes by class type
- Average or highest hero level
