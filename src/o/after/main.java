package o.after;

import o.after.Applicant.Applicant;
import o.after.Applicant.ExecutiveApplicant;
import o.after.Applicant.ManagerApplicant;
import o.after.Applicant.StaffApplicant;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Applicant> applicants = Arrays.asList(
                new StaffApplicant("William", "Ardianto"),
                new ManagerApplicant("Wilson", "Lim"),
                new ExecutiveApplicant("Wesley", "Lim")
        );

        List<Employee> employees = applicants.stream().map(applicant -> applicant.getAccountProcessor().create(applicant)).collect(Collectors.toList());

        for (Employee employee : employees) {
            System.out.println(String.format("%s %s: %s IsManager: %s IsExecutive: %s", employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.isManager(), employee.isExecutive()));
        }
    }
}