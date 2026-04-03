package withnosolid.nodi;

public class UserService {
    // High level module  depand on  low level module
    private MySQLDatabase db = new MySQLDatabase();
    public void saveUser(String user){ db.save(user); }
}
