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
