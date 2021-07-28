package singleton.pattern;

import repository.pattern.Order;
import repository.pattern.OrderRepository;
import repository.pattern.OrderRepositoryImpl;

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

    /**
     * Menggunakan singletone
     * @param orderId
     */
//    public void save (String orderId){
//        DatabaseHelper.getConnection()
//                .sql("INSERT INTO ORDER ....");
//    }

    /**
     * Menggunakan pooling
     */

//    public void save (String orderId){
//        Connection connection = DatabasePool.getConnection();
//        connection.sql("INSERT INTO ORDER ..");
//        DatabasePool.close(connection);
//    }

    /**
     * Menggunakan Repository
     */

    public void save(String orderId){
        OrderRepository orderRepository = new OrderRepositoryImpl();
        orderRepository.insert(new Order(orderId));
    }
}
