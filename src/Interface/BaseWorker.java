package Interface;

public abstract class BaseWorker extends BasePerson implements ISalary {

    BaseWorker(String firstName, String lastName, char gender, int age, String status) {
        super(firstName, lastName, gender, age, status);
    }
    @Override
    public double getBaseSalary() {
        return 0;
    }

    @Override
    public double getSalaryPerMonth() {
        return 0;
    }
}