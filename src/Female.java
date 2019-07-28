public class Female extends Student {

    public String PilnieUczeSieWszystkiego() {
        return "Pilnie " + super.UczeSieWszystkiego();
    }

    public Female(String name, String surname) {
        super(name, surname);
    }
}
