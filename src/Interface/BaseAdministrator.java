package Interface;

public abstract class BaseAdministrator extends BasePerson implements ISalary{

    BaseAdministrator(String firstName, String lastName, char gender, int age, String status) {
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
