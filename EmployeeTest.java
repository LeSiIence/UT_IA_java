public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = {
            new Employee(),
            new Secretary(),
            new LegalSecretary(),
            new Marketer()
        };
        

        /*
            a super class reference can point to different subclass objects. determine which override functions at runtime.
        */
        for(Employee emp : staff) {
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Vacation Days: " + emp.getVacationDays());
            System.out.println("Vacation Form: " + emp.getVacationForm());
            System.out.println();
        }
    }
}
