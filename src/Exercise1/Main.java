package Exercise1;

public class Main {
    public static void main(String[] args) {
        Worker onlineWorker = new OnSiteWorker("Anna", "Garcia", 25.0);
        Worker officeWorker = new OfficeWorker("Carlos", "Lopez", 30.0);
        Worker genericWorker = new Worker("Maria", "Rodriguez", 20.0);

        double hours = 160.0;

        double onlineSalary = onlineWorker.calculateSalary(hours);
        double officeSalary = officeWorker.calculateSalary(hours);
        double genericSalary = genericWorker.calculateSalary(hours);

        System.out.println("Online Worker Salary: " + onlineSalary);
        System.out.println("Office Worker Salary: " + officeSalary);
        System.out.println("Generic Worker Salary: " + genericSalary);

        OfficeWorker.setFuelAllowance(45.0);

        double updatedOfficeSalary = officeWorker.calculateSalary(hours);
        System.out.println("Updated Office Worker Salary: " + updatedOfficeSalary);
    }
}