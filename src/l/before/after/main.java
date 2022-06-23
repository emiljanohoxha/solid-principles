package l.before.after;

public class main {
    public static void main(String[] args) {
        Manager accountingVP = new Manager();

        accountingVP.setFirstName("William");
        accountingVP.setLastName("Ardianto");
        accountingVP.calculatePerHourRate(4);

        MainEmployee employee = new MainEmployee();

        employee.setFirstName("Wilson");
        employee.setLastName("Lim");
        employee.calculatePerHourRate(2);

        System.out.println(String.format("%s salary is %s/hour", employee.getFirstName(), employee.getSalary()));
    }
}