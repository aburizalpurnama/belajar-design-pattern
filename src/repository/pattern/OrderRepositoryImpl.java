package repository.pattern;

import singleton.pattern.Connection;
import singleton.pattern.DatabasePool;

import java.util.List;

public class OrderRepositoryImpl implements OrderRepository{
    @Override
    public void insert(Order data) {
        Connection connection = DatabasePool.getConnection();
        connection.sql("INSERT INTO ORDER ..");
        DatabasePool.close(connection);
    }

    @Override
    public void update(String id) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Order select(String id) {
        return null;
    }

    @Override
    public List<Order> selectAll() {
        return null;
    }
}
