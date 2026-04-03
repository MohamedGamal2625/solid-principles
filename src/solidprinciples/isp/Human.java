package solidprinciples.isp;

public class Human implements Workable,Eatable{
    @Override
    public void eat() {
        System.out.println("Human eating");
    }

    @Override
    public void work() {
        System.out.println("Human working");

    }
}
