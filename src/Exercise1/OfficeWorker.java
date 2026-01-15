package Exercise1;

class OfficeWorker extends Worker {
    private static double fuelAllowance = 40.0;

    public OfficeWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(double hoursWorked) {
        return super.calculateSalary(hoursWorked) + fuelAllowance;
    }

    public static void setFuelAllowance(double amount) {
        fuelAllowance = amount;
    }

    public static double getFuelAllowance() {
        return fuelAllowance;
    }
}
