package Exercise2;

class OnSiteWorker extends Worker {
    private static final double INTERNET_FLAT_RATE = 50.0;

    public OnSiteWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(double hoursWorked) {
        return super.calculateSalary(hoursWorked) + INTERNET_FLAT_RATE;
    }

    @Deprecated
    public double calculateSalaryWithoutInternet(double hoursWorked) {
        return hoursWorked * pricePerHour;
    }
}
