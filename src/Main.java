import utility.RateFileReader;
import utility.TextFileReader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        RateFileReader test = new RateFileReader("Kane.txt");
        List<String> tester = test.readFile();

        System.out.println(tester);
    }

}
