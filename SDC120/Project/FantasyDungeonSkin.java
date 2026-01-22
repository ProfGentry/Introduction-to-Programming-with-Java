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
