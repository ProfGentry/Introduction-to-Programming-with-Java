/*******************************************************************************************
 * 🚫 DO NOT MODIFY THIS FILE 🚫
 *
 * This file is part of the required project framework.
 *
 * You are NOT allowed to:
 *  - Add methods
 *  - Remove methods
 *  - Rename methods
 *  - Change method signatures
 *  - Change the interface structure
 *
 * You ARE allowed to:
 *  - Create classes that IMPLEMENT this interface
 *  - Call these methods from your program
 *
 * Why this exists:
 * This interface acts as a contract. Your program depends on it staying the same.
 * Modifying this file will likely cause your project to break and may result in
 * point deductions.
 *
 * Treat this file as if it were part of a library you did not write.
 *
 * If you think this file needs to change, you are almost certainly doing
 * something incorrectly elsewhere in your code.
 *******************************************************************************************/

public interface GameSkin {

    /**
     * @return The title of the game displayed at startup
     */
    String getGameTitle();

    /**
     * @return The name used for a playable character
     * (e.g., Hero, Crew Member, Operator)
     */
    String getCharacterTypeName();

    /**
     * @return The name used for a quest or mission
     */
    String getQuestName();

    /**
     * @return Text describing an idle character's status
     */
    String getIdleStatus();

    /**
     * @return Text describing an injured character's status
     */
    String getInjuredStatus();

    /**
     * @return Text describing a retired character's status
     */
    String getRetiredStatus();

    /**
     * @param name The character's name
     * @return A success message when a quest is completed successfully
     */
    String getQuestSuccessMessage(String name);

    /**
     * @param name The character's name
     * @return A failure message when a quest does not succeed
     */
    String getQuestFailureMessage(String name);
}
