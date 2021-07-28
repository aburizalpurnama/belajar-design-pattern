package factory.pattern;

public class EmployeeApp {
    public static void main(String[] args) {

        /**
         * TANPA FACTORY PATTERN
         * karena di class Employee data yang berbeda hanyalah nama, sedangkan data jabatan dan gaji \nya akan selalu
         * sama maka sebaiknya dibuat dengan menggunakan factory pattern, selain lebih simple ini dapat menghindari
         * dari kesalahan saat input data gaji atau jabatan.
         */
//        var manager1 = new Employee("Aslan", "Manager", 100_000_000);
//        var manager2 = new Employee("Budi", "Manager", 100_000_000);
//        var staff1 = new Employee("Asilon", "Manager", 20_000_000);
//        var staff2 = new Employee("Rahman", "Manager", 20_000_000);

        var manager1 = EmployeeFactory.createManager("Aslan");
        var manager2 = EmployeeFactory.createManager("Budi");
        var staff1 = EmployeeFactory.createStaff("Asilon");
        var staff2 = EmployeeFactory.createStaff("Rahman");

        System.out.println(manager1);
        System.out.println(manager2);
        System.out.println(staff1);
        System.out.println(staff2);

    }
}
