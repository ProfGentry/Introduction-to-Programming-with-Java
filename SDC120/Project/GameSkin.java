public interface GameSkin {

    String getGameTitle();

    String getCharacterTypeName();

    String getQuestName();

    String getIdleStatus();

    String getInjuredStatus();

    String getRetiredStatus();

    String getQuestSuccessMessage(String name);

    String getQuestFailureMessage(String name);
}
