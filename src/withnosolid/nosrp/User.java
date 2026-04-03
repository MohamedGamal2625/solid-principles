package withnosolid.nosrp;

public class User {
    private String name;
    private String email;

    //handle data user
    public User(String name,String email){
        this.name=name;
        this.email=email;
    }
    // violate SRP
    //save to db
    public void saveToDb(){
        System.out.println("saving"+name+"to database");
    }
}
