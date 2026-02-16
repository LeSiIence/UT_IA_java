public class Marketer extends Employee {
    @Override
    public double getSalary() {
        //return 50000.0;

        //refactoring
        return super.getSalary() + 10000.0;
    }

    public String advertise() {
        return "Our product is the best!";
    }
}
