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
