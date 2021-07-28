package singleton.pattern;

import java.util.ArrayList;
import java.util.List;

public class DatabasePool {
    private static List<Connection> pool = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            Connection connection = new Connection("localhost", "root", "root");
            pool.add(connection);
        }
    }

    public static Connection getConnection(){
        if (pool.isEmpty()){
            throw new RuntimeException("Poolnya dah habees");
        } else {
            return pool.remove(0);
        }
    }

    public static void close(Connection connection){
        pool.add(connection);
    }
}
