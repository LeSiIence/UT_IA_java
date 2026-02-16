public class LegalSecretary extends Secretary {
    public String FileLegalBrief() {
        return "Legal brief filed.";
    }

    @Override
    public double getSalary() {
        return 45000.0;
    }
}
