package factory.pattern;

public class EmployeeFactory {
    public static Employee createManager (String nama){
        return new Employee(nama, "Manager", 100_000_000);
    }
    public static Employee createStaff (String nama){
        return new Employee(nama, "Staff", 20_000_000);
    }
}
