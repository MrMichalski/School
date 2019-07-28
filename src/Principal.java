public class Principal extends Teacher {

    // Hire and Fire functions will be added soon


    public Principal(String name, String surname) {
       super(name, surname);
        this.salaryMultiplier=2;
    }

    @Override
    public int countSalaty() {
        return 0;
    }
}
