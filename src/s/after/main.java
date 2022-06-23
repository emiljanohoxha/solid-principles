package s.after;

public class main {
    public static void main(String[] args) {

        Outputs.welcomeOutput();
        Person person = InputPerson.capture();
        Validation.validate(person);
        CreatePerson.create(person);
        Outputs.endOutput();

    }
}
