import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {
    static void jeCalculeLaDate() {
        //DateTime d = formatter.parseDateTime(text);
        System.out.println("Static methods can be called without creating objects");
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine("Quelle est ton année de naissance ? (yyyy/MM/dd): ");
        DateFormat format = new SimpleDateFormat(data);

    }
}
