public class Dungeon implements BasicDungeon {
    private boolean isOpened = false;

    @Override
    public void open(Party party) {
        if (party.getPartyMembers().length < 3) {
            System.out.println("Not enough paty members");
            isOpened = false;
        } else {
            System.out.println("Welcome heroes \nGet ready for adventure");
            isOpened = true;
        }
    }
}
