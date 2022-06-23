package o.after.Applicant;



import o.after.CreateAccount;

public interface Applicant {
    String getFirstName();

    String getLastName();

    CreateAccount getAccountProcessor();
}