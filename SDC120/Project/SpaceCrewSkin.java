/*******************************************************************************************
 * ⚠️ DO NOT MODIFY THIS FILE ⚠️
 *
 * This file provides the Space Crew theme for the game.
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
 * It controls how the game presents itself (theme, wording, flavor), while the rest of your program handles the actual game logic.
 *
 * Modifying this file breaks the contract established by GameSkin and may result in incorrect behavior or grading deductions.
 *
 * Treat this file as read-only, similar to a provided library.
 *******************************************************************************************/

/**
 * SpaceCrewSkin defines a science-fiction space operations theme.
 *
 * This implementation supplies all text and descriptions used when the game is running in a space-station or mission-based setting.
 *
 * Examples:
 *  - Characters are called "Crew Members"
 *  - Quests are called "Missions"
 *  - Status messages reflect space operations outcomes
 *
 * IMPORTANT:
 * Your program should reference this class only through the GameSkin interface, not directly by method calls tied to space-specific wording.
 */

public class SpaceCrewSkin implements GameSkin {

    @Override
    public String getGameTitle() {
        return "Orbital Ops: Space Crew Command";
    }

    @Override
    public String getCharacterTypeName() {
        return "Crew Member";
    }

    @Override
    public String getQuestName() {
        return "Mission";
    }

    @Override
    public String getIdleStatus() {
        return "On standby aboard the station";
    }

    @Override
    public String getInjuredStatus() {
        return "In medical bay";
    }

    @Override
    public String getRetiredStatus() {
        return "Grounded permanently";
    }

    @Override
    public String getQuestSuccessMessage(String name) {
        return name + " completes the mission successfully.";
    }

    @Override
    public String getQuestFailureMessage(String name) {
        return name + " returns from the mission injured.";
    }
}
