package singleton.pattern;

public class OrderDetilService {

    /**
     * Method ini akan membuat objek koneksi terus menerus saat melakukan akses ke database.
     * hal ini sangat buruk karena dapat menyebabkan aplikasi yang lelet karena menumpuknya
     * objek koneksi yang dibikin.
     *
     * Solusinya yaitu dengan membuat sebuah utility class yang khusus membuat objek koneksi,
     * dan sebelum objek koneksi dibuat, harus mengecek apakan objek koneksi sudah tersedia atau belum.
     * Objek koneksi akan dibuat hanya jika koneksi belum tersedia.
     * @param orderId
     * @param product
     */
//    public void save (String orderId, String product){
//        Connection connection = new singleton.pattern.Connection("localhost", "root", "root");
//        connection.sql("INSERT INTO ORDER_DETAIL ....");
//    }
    public void save (String orderId, String product){
        DatabaseHelper.getConnection()
                .sql("INSERT INTO ORDER_DETAIL ....");
    }
}
