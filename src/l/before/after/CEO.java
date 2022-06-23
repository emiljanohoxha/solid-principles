package l.before.after;

public class CEO extends Employee  {

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 150;

        salary = baseAmount * rank;
    }


    public void fireSomeone() {
        System.out.println("You're Fired!");
    }
}