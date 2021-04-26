package school;

public final class Nurse extends BaseWorker{

    Nurse(String firstName, String lastName, char gender, int age, String status) {
        super(firstName, lastName, gender, age, status);
    }

    @Override
    public double getSalary(){return 0;}

    @Override
    public double getTaxes(){return 0;}

}
