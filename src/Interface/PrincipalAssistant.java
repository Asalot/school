package Interface;

public final class PrincipalAssistant extends BaseAdministrator {

    PrincipalAssistant(String firstName, String lastName, char gender, int age, String status) {
        super(firstName, lastName, gender, age, status);
    }

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public double getTaxes() {
        return 0;
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
