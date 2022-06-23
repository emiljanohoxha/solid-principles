package o.after.Applicant;

import o.after.Applicant.Applicant;

import o.after.CreateAccount;
import o.after.StaffAccount;


public class StaffApplicant implements Applicant {
    String firstName;
    String lastName;
    CreateAccount createAccount;

    public StaffApplicant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createAccount = new StaffAccount();
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public CreateAccount getAccountProcessor() {
        return createAccount;
    }
}