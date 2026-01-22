/**
 * GameSkin defines the "theme layer" for the game.
 *
 * This interface allows the program to change its presentation (text, names, messages, flavor) without changing any game logic.
 *
 * IMPORTANT:
 * - You should NOT modify this interface.
 * - You will choose ONE class that implements this interface.
 * - Your program should reference GameSkin methods instead of
 *   hardcoding text directly into your logic.
 *
 * This demonstrates:
 * - Interfaces
 * - Polymorphism
 * - Separation of concerns (logic vs presentation)
 *
 * In real-world software, this pattern is used for:
 * - Themes / skins
 * - Localization (language support)
 * - Feature toggles
 * - White-labeled applications
 */

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
