public class Dungeon implements BasicDungeon {
    private boolean isOpened = false;
    private MonsterClass[] monsters;  // eto massiv kot-yiy budet zapolnyatsya monstrami


    @Override
    public boolean open(Party party) {
        if (party.getPartyMembers().length < 3) {
            System.out.println("Not enough paty members");
            isOpened = false;
        } else {
            System.out.println("Welcome heroes \nGet ready for adventure");
            isOpened = true;
        }
        return isOpened;
            }
}
