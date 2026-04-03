package solidprinciples.single.responsibility;

public class User {
    // 1- single responsiblity // handle user data nothing else
    private String name;
    private String email;

    public String getName(){return name;}
    public User(){}
    //handle data user
    public User(String name,String email){
        this.name=name;
        this.email=email;
    }
}
