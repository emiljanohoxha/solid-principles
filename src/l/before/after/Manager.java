package l.before.after;

import l.before.Employee;

public class Manager extends MainEmployee {

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 19.75;

        salary = baseAmount + (rank * 4);
    }

    public void setFirstName(String william) {
    }

    public void setLastName(String ardianto) {
    }
}
