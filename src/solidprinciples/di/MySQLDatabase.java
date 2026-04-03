package solidprinciples.di;

public class MySQLDatabase implements Database{
    @Override
    public void save(String data) {
        System.out.println("saving to mysql"+data);
    }
}
