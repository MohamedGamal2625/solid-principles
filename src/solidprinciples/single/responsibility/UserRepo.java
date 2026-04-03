package solidprinciples.single.responsibility;

public class UserRepo {
    User user;
    public void saveToDb(){
        System.out.println("saving"+new User().getName()+"to database");
    }

}
