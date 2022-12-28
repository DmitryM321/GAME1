public class Party {
    private CharacterClass[] partyMembers;                           // massiv personagey

    public Party(CharacterClass... memebers) {       // ne znaem scolko pridet igrikov. eto spiski. pridem massiv c unnow people
        partyMembers = new CharacterClass[memebers.length];
        //  this.partyMembers = partyMembers;
        //  for (int i = 0, i < partyMembers.length; i++);
        for (int i = 0; i < partyMembers.length; i++) {
            partyMembers[i] = memebers[i];
        }
    }
    public void enterDungeron(Dungeon dungeon){
        dungeon.open(this);

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
    }

