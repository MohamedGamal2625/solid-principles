package solidprinciples.isp;

public class Robot implements Workable{

    @Override
    public void work() {
        System.out.println("working");
    }
}
