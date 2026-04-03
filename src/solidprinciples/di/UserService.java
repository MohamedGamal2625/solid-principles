package solidprinciples.di;

public class UserService {
    //DIP achieved: high-level UserService depends on interface, not concrete MySQL.
    private Database database;
    public UserService(Database database){
        this.database=database;
    }
    public void saveUser(String data){database.save(data);}
}
