package solidprinciples.lsp;

public class Ostrich extends Bird implements Flyable{
    // subclasses can replace base types without breaking parent behavior.
    @Override
    public void fly() {
        System.out.println("cant fly");
    }
}
