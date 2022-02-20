package entities;

public class HourlyEmployee extends Employee {
    private int hours;
    private float wage;

    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {
        super(firstName, lastName, id);
        this.hours = hours;
        this.wage = wage;
    }

    public HourlyEmployee(int hours, float wage) {
//        super();
        this.hours = hours;
        this.wage = wage;
    }

    @Override
    public float earnings() {
        return 0;
    }
}
