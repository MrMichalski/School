public class LanguageTeacher extends Teacher {

    public String CzytajKsiazki() {
        return "Czytam Książki";

    }

    @Override
    public int countSalaty() {
        return 200;
    }

    public LanguageTeacher(String name, String surname) {
        super(name, surname);
        this.salaryMultiplier=1;
    }
}
