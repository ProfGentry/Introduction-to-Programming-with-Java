/*******************************************************************************************
 * Main.java
 *
 * Entry point for the Dungeon Operation system (DOS) game.
 *
 * This class is responsible for:
 *  - Selecting ONE GameSkin implementation
 *  - Creating the GameEngine
 *  - Starting the program
 *
 * IMPORTANT:
 * - Game logic should NOT be written here.
 * - Do NOT duplicate menu or gameplay logic in Main.
 *
 * Design note:
 * Main acts as the bootstrapper for the application.
 * In real-world software, this is where configuration
 * and startup decisions are made.
 *******************************************************************************************/
// Name: 
// CYB120 Final Project

public class Main {
    public static void main(String[] args) {

        // Choose ONE skin:
        GameSkin skin = new FantasyDungeonSkin();
        // GameSkin skin = new SpaceCrewSkin();
        // GameSkin skin = new CyberpunkHackerSkin();

        GameEngine engine = new GameEngine(skin);
        engine.run();
    }
}
