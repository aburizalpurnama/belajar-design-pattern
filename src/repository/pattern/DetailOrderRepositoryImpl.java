package repository.pattern;

import singleton.pattern.Connection;
import singleton.pattern.DatabaseHelper;
import singleton.pattern.DatabasePool;

import java.util.List;

public class DetailOrderRepositoryImpl implements DetailOrderRepository{
    @Override
    public void insert(DetailOrder data) {
        Connection connection = DatabaseHelper.getConnection();
        connection.sql("INSERT INTO ORDER_DETAIL ...." + data.getId());
        DatabasePool.close(connection);
    }

    @Override
    public void update(String id) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public DetailOrder select(String id) {
        return null;
    }

    @Override
    public List<DetailOrder> selectAll() {
        return null;
    }
}
