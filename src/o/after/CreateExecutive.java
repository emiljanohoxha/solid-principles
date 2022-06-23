package o.after;

import o.after.Applicant.Applicant;
import o.after.CreateAccount;
import o.after.Employee;


public class CreateExecutive implements CreateAccount {
    @Override
    public Employee create(Applicant applicant) {

        return new Employee(applicant.getFirstName(), applicant.getLastName(),
                String.format("%s.%s@example.com", applicant.getFirstName(), applicant.getLastName()),
                true, true);
    }
}