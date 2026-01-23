/*******************************************************************************************
 * ⚠️ DO NOT MODIFY THIS FILE ⚠️
 *
 * This file provides the Fantasy Dungeon theme for the game.
 *
 * You are NOT allowed to:
 *  - Change method names or signatures
 *  - Add or remove methods
 *  - Alter return values
 *  - Modify text inside the methods
 *
 * You ARE allowed to:
 *  - Use this class as your selected GameSkin
 *  - Reference its methods through the GameSkin interface
 *
 * Why this exists:
 * This class is a concrete implementation of the GameSkin interface.
 * It controls how the game presents itself (theme, wording, flavor),
 * while the rest of your program handles the actual game logic.
 *
 * Modifying this file breaks the connection established by GameSkin and may result in incorrect behavior or grading deductions.
 *
 * Treat this file as read-only, similar to a provided library.
 *******************************************************************************************/

/**
 * FantasyDungeonSkin defines the classic fantasy RPG theme.
 *
 * This implementation supplies all text and descriptions used when the game is running in a dungeon-based fantasy setting.
 *
 * Examples:
 *  - Characters are called "Heroes"
 *  - Quests are called "Dungeon Quests"
 *  - Status messages reflect fantasy-style outcomes
 *
 * IMPORTANT:
 * Your program should reference this class only through the GameSkin interface, not directly by method calls tied to fantasy wording.
 */

public class FantasyDungeonSkin implements GameSkin {

    @Override
    public String getGameTitle() {
        return "Dungeon Ops: Heroes of the Realm";
    }

    @Override
    public String getCharacterTypeName() {
        return "Hero";
    }

    @Override
    public String getQuestName() {
        return "Dungeon Quest";
    }

    @Override
    public String getIdleStatus() {
        return "Resting at the tavern";
    }

    @Override
    public String getInjuredStatus() {
        return "Wounded and recovering";
    }

    @Override
    public String getRetiredStatus() {
        return "Retired from adventuring";
    }

    @Override
    public String getQuestSuccessMessage(String name) {
        return name + " returns victorious with treasure!";
    }

    @Override
    public String getQuestFailureMessage(String name) {
        return name + " barely escapes the dungeon injured.";
    }
}
