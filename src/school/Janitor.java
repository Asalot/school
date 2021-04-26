package school;

public final class Janitor extends BaseWorker{

    Janitor(String firstName, String lastName, char gender, int age, String status) {
        super(firstName, lastName, gender, age, status);
    }

    @Override
    public double getSalary(){return 0;}

    @Override
    public double getTaxes(){return 0;}

}
