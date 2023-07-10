package task1;

public class Program {
    public static void main(String[] args) {

        while (true) {
            Presenter p = new Presenter(new SumModel(), new View());
            p.buttonClick();
        }
    }
}
