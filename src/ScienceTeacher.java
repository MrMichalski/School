public class ScienceTeacher extends Teacher {

    public String RobieZadania() {
        return "Robię Zadania";
    }

    @Override
    public int countSalaty() {
        return 500;
    }

    public ScienceTeacher(String name, String surname) {
        super(name, surname);
        this.salaryMultiplier = 3;
    }
}
