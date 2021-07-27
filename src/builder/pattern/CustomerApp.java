package builder.pattern;

public class CustomerApp {
    public static void main(String[] args) {

        /**
         * Tanpa builder design pattern, saat kita membuat objek dari kelas customer maka kita harus memberikan
         * semua parameter yang ada pada constructor.
         */
//        Customer customer1 = new Customer("c01", "aslan", "asilon", 19, "Bekasi", "pria");
//        Customer customer2 = new Customer("c01", "aslan", "", 19, "Bekasi", "pria");
//        Customer customer4 = new Customer("c01", "aslan", "asilon", 19, "", "");

        Customer customer1 = new CustomerBuilder()
                .setId("c01")
                .setFirstName("aslan")
                .setLastName("asilon")
                .setAge(20)
                .setGender("pria")
                .build();

        Customer customer2 = new CustomerBuilder()
                .setId("c01")
                .setFirstName("aslan")
                .setAge(20)
                .setGender("pria")
                .build();

        Customer customer3 = new CustomerBuilder()
                .setId("c01")
                .setFirstName("aslan")
                .setLastName("asilon")
                .setAge(20)
                .build();
    }
}
