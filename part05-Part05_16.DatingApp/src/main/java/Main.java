
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(30, 12, 2011);
        date.advance(360);
        System.out.println(date.toString());
    }
}
