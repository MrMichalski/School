public abstract class Student extends Person {

    int Grades[];

    public Student (String name, String surname) {
        super(name, surname);
    }

    public String UczeSieWszystkiego() {
        System.out.println("Wszystkiego");
        return super.UczeSie();



    }
}
