public class LegalSecretary extends Secretary {
    public String fileLegalBrief() {
        return "Legal brief filed.";
    }

    @Override
    public double getSalary() {
        //return 45000.0;
        return super.getSalary();
    }

    public static void main(String[] args) {
        LegalSecretary legalSecretary = new LegalSecretary();
        System.out.println(legalSecretary.getSalary());
        System.out.println(legalSecretary.getVacationDays());
        System.out.println(legalSecretary.getVacationForm());
        System.out.println(legalSecretary.takeDictation("This is a legal dictation."));
        System.out.println(legalSecretary.fileLegalBrief());
    }
}
