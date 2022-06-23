package o.after;

import o.after.Applicant.Applicant;
import o.after.Employee;
import o.after.CreateAccount;


public class StaffAccount  implements CreateAccount {
    @Override
    public Employee create(Applicant applicant) {

        return new Employee(applicant.getFirstName(), applicant.getLastName(),
                String.format("%s.%s@example.com", applicant.getFirstName(), applicant.getLastName()),
                false, false);
    }
}