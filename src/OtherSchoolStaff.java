public class OtherSchoolStaff extends Person{

    int respect;

    public String Dominate() {
        respect = respect + 20;
        return "Woźna zawsze groźna";
    }

        public String Clean() {
            return "Myję kible";
    }

    public OtherSchoolStaff(int respect, String name, String surname) {
        super(name, surname);
        this.respect = respect;
    }
}
