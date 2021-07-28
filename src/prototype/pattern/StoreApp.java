package prototype.pattern;

public class StoreApp {
    public static void main(String[] args) {
        try {
            createStoreWithClone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    // Manual satu persatu
    void creteStore1(){
        var store1 = new Store("danang", "Indonesia", "Bekasi", "Gadget");
        var store2 = new Store("albus", "Indonesia", "Bekasi", "Gadget");
        var store3 = new Store("barokah", "Indonesia", "Jakarta", "fresh food");
        var store4 = new Store("aslan", "Indonesia", "jakarta", "fashion");
    }

    // Manual ngambil nilai dari objek lain
    void createStore2(){
        var store1 = new Store("danang", "Indonesia", "Bekasi", "Gadget");
        var store2 = new Store("albus", store1.getCountry(), store1.getCity(), store1.getCategory());
        var store3 = new Store("barokah", store1.getCountry(), "Jakarta", "fresh food");
        var store4 = new Store("aslan", store1.getCountry(), store3.getCity(), "fashion");
    }

    // with prototyping pattern (cloning)
    static void createStoreWithClone() throws CloneNotSupportedException {
        var store1 = new Store("danang", "Indonesia", "Bekasi", "Gadget");
        var store2 = store1.manualClone();
        store2.setName("albus");
        var store3 = store2.manualClone();
        store3.setName("barokah");
        store3.setCity("Jakarta");
        store3.setCategory("fresh food");
        var store4 = store3.autoClone();
        store4.setName("aslan");
        store4.setCategory("fashon");

        System.out.println(store1);
        System.out.println(store2);
        System.out.println(store3);
        System.out.println(store4);
    }
}
