/*******************************************************************************************
 * GameEngine.java
 * Programmer: 
 *
 * Core engine for the DOS project.
 *
 * This class contains the main game logic and coordinates:
 *  - Menu-driven program flow
 *  - Hero creation and storage
 *  - Quest assignment and resolution
 *  - State changes (idle, on quest, injured, retired)
 *  - Reports and statistics
 *
 * COURSE WEEK ALIGNMENT
 * -------------------------------------------------------
 * Week 2:
 *  - Menu loops and control flow
 *  - Method-based program structure
 *
 * Week 3:
 *  - Working with ArrayList<Character>
 *  - Calling polymorphic methods on objects
 *
 * Week 4:
 *  - Game logic decisions
 *  - State management and transitions
 *  - Searching and updating objects by ID
 *  - Exception-safe input handling
 *
 * Week 5:
 *  - Program integration
 *  - Reporting and statistics
 *  - Defensive programming patterns
 *
 * IMPORTANT DESIGN NOTES
 * -------------------------------------------------------
 * - This class SHOULD contain game logic.
 * - This class should NOT contain input validation helpers (those belong in InputHelper).
 * - This class should NOT contain presentation text that belongs in GameSkin implementations.
 *
 * If this file becomes hard to read, the program likely needs refactoring into additional methods.
 *******************************************************************************************/

