package singleton.pattern;

public class Connection {
    String host;
    String username;
    String password;

    public Connection(String host, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }

    public void sql(String sql){

    }
}
