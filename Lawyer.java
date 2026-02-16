public class Lawyer extends Employee {
    @Override
    public int getVacationDays() {
        return 15;
    }

    public int getVacationDays(int extraDays) {
        return getVacationDays() + extraDays;
    }

    @Override
    public String getVacationForm() {
        return "pink";
    }

    public String sue() {
        return "I'll see you in court!";
    }
    
}
