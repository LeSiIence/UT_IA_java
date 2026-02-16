public class Secretary extends Employee {
    @Override
    public double getSalary() {
        //return 45000.0;
        return super.getSalary() + 5000.0;
    }

    @Override
    public int getVacationDays() {
        return 15;
    }

    @Override
    public String getVacationForm() {
        return "pink";
    }

    public String takeDictation(String text) {
        return "Dictation taken: " + text;
    }
}