package ahmedov.ru.mirea.lab1;

public class EmployeeTest {
    public static void main(String args[]){
        Employee empOne = new Employee("Elvin Ahmedov");
        Employee empTwo = new Employee("Andrey Iliyc");

        empOne.empAge(19);
        empOne.empDesignation("Cashier");
        empOne.empSalary(20000);
        empOne.printEmployee();

        empTwo.empAge(23);
        empTwo.empDesignation("Managers Assistant");
        empTwo.empSalary(35000);
        empTwo.printEmployee();
    }
}
