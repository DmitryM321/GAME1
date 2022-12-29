public class Party {
    private CharacterClass[] partyMembers;                           // massiv personageyp\
    private Dungeon dungeon;
    public Party(CharacterClass... memebers) {       // ne znaem scolko pridet igrikov. eto spiski. pridem massiv c unnow people
        partyMembers = new CharacterClass[memebers.length];
        //  this.partyMembers = partyMembers;
        //  for (int i = 0, i < partyMembers.length; i++);
        for (int i = 0; i < partyMembers.length; i++) {
            partyMembers[i] = memebers[i];
        }
    }
    public boolean enterDungeron(Dungeon dungeon){
       return dungeon.open(this);


    }

    public void runDungerob(){  //for() sdelat' massiv po vsem iz patry: party members attack monsters. ubili/neubili
                                // esli ubili idem dalshe, esli net - proigrali/
                                // nuzhen dvoiniy vlozhennyi cikl/


    }
    public CharacterClass[] getPartyMembers() {
        return partyMembers;
    }

    public void setPartyMembers(CharacterClass[] partyMembers) {
        this.partyMembers = partyMembers;
    }

    public void info() {
            //      for (CharacterClass partyMember : partyMembers) ;
            for (CharacterClass partyMember : partyMembers) {
                partyMember.info();
            }
        }

    public Dungeon getDungeon() {
        return dungeon;
    }

    public void setDungeon(Dungeon dungeon) {
        this.dungeon = dungeon;
    }
}

