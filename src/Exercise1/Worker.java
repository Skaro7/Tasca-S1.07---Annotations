package Exercise1;

class Worker {
    protected String name;
    protected String surname;
    protected double pricePerHour;

    public Worker(String name, String surname, double pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public double calculateSalary(double hoursWorked) {
        return hoursWorked * pricePerHour;
    }
}