/*******************************************************************************************
 * ⚠️ DO NOT MODIFY THIS FILE ⚠️
 *
 * This file provides the Cyberpunk Hacker theme for the game.
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
 * CyberpunkHackerSkin defines a futuristic hacker-operations theme.
 *
 * This implementation supplies all text and descriptions used when the game is running in a cyberpunk or digital-operations setting.
 *
 * Examples:
 *  - Characters are called "Operators"
 *  - Quests are called "Cyber Operations"
 *  - Status messages reflect high-risk digital missions
 *
 * IMPORTANT:
 * Your program should reference this class only through the GameSkin interface, not directly by method calls tied to cyberpunk-specific wording.
 */
public class CyberpunkHackerSkin implements GameSkin {

    @Override
    public String getGameTitle() {
        return "Neon Ops: Hacker Cell Command";
    }

    @Override
    public String getCharacterTypeName() {
        return "Operator";
    }

    @Override
    public String getQuestName() {
        return "Cyber Operation";
    }

    @Override
    public String getIdleStatus() {
        return "Laying low in the grid";
    }

    @Override
    public String getInjuredStatus() {
        return "Burned and recovering";
    }

    @Override
    public String getRetiredStatus() {
        return "Ghosted from the network";
    }

    @Override
    public String getQuestSuccessMessage(String name) {
        return name + " completes the op without a trace.";
    }

    @Override
    public String getQuestFailureMessage(String name) {
        return name + " trips an alarm and barely escapes.";
    }
}
