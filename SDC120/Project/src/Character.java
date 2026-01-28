/*******************************************************************************************
 * Character.java
 * Programmer: 
 *
 * Base class for all playable characters in the Dungeon Ops project.
 *
 * This class defines the shared state and behavior that all character
 * types have in common
 *
 * COURSE WEEK ALIGNMENT
 * -------------------------------------------------------
 * Week 3:
 *  - Creating classes and objects
 *  - Constructors
 *  - Encapsulation (private fields, getters/setters)
 *  - Designing reusable base classes
 *
 * Week 4:
 *  - Inheritance (subclasses extend this class)
 *  - Polymorphism (shared method contracts)
 *  - State management (idle, on quest, injured, retired)
 *
 * KEY RESPONSIBILITIES
 * -------------------------------------------------------
 * - Store character data (ID, name, level, health, status)
 * - Manage character state transitions
 * - Provide methods meant to be overridden by subclasses
 * - Maintain an event log for each character
 *
 * DESIGN NOTES
 * -------------------------------------------------------
 * - This class should NOT contain menu logic.
 * - This class should NOT contain user input handling.
 * - Subclasses should add behavior, not duplicate logic.
 *
 * If you find yourself copying code from this class into
 * subclasses, you are likely doing something incorrectly.
 *******************************************************************************************/

