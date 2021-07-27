package singleton.pattern;

public class DatabaseHelper {
    private static Connection connection;
    public static Connection getConnection (){
        if (connection == null){
            return new Connection("localhost", "root", "root");
        }
        return connection;
    }
}
