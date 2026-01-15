package Exercise2;

public class Main {
    @SuppressWarnings("deprecation")
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

        double deprecatedSalary1 = genericWorker.calculateWeeklySalary(hours);
        System.out.println("Deprecated Weekly Salary: " + deprecatedSalary1);

        OnSiteWorker onSiteWorker = (OnSiteWorker) onlineWorker;
        double deprecatedSalary2 = onSiteWorker.calculateSalaryWithoutInternet(hours);
        System.out.println("Deprecated Salary Without Internet: " + deprecatedSalary2);

        OfficeWorker officeWorkerCast = (OfficeWorker) officeWorker;
        double deprecatedSalary3 = officeWorkerCast.calculateSalaryOldMethod(hours);
        System.out.println("Deprecated Old Method Salary: " + deprecatedSalary3);

        OfficeWorker.setFuelAllowance(45.0);

        double updatedOfficeSalary = officeWorker.calculateSalary(hours);
        System.out.println("Updated Office Worker Salary: " + updatedOfficeSalary);
    }
}