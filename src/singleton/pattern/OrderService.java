package singleton.pattern;

public class OrderService {

    /**
     * Method ini akan membuat objek koneksi terus menerus saat melakukan akses ke database.
     * hal ini sangat buruk karena dapat menyebabkan aplikasi yang lelet karena menumpuknya
     * objek koneksi yang dibikin.
     * @param orderId
     */
//    public void save (String orderId){
//        Connection connection = new singleton.pattern.Connection("localhost", "root", "root");
//        connection.sql("INSERT INTO ORDER ....");
//    }

    public void save (String orderId){
        DatabaseHelper.getConnection()
                .sql("INSERT INTO ORDER ....");
    }
}
