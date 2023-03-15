import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
public static void main(String[] args) {
        int k = 0;
        while(k<1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите выражение");
            String abcd = scanner.nextLine();
            if (abcd.contains("Quit") || abcd.contains("quit")) {
                System.out.println("Завершение работы");
                System.exit(1);
            }
            String[] abcdArray;


            abcdArray = abcd.split(" ");
            List<String> abcdArrayNew = new ArrayList<>();
            for (String s : abcdArray) {
                if (s.length() == 1 && (s.contains("+") || s.contains("-") || s.contains(":") || s.contains("*"))) {
                    continue;
                }
                abcdArrayNew.addAll(List.of(s.split("/")));
            }


            int a = Integer.parseInt(abcdArrayNew.get(0));
            int b = Integer.parseInt(abcdArrayNew.get(1));
            int c = Integer.parseInt(abcdArrayNew.get(2));
            int d = Integer.parseInt(abcdArrayNew.get(3));

            Fractions f1 = new Fractions(a, b);
            Fractions f2 = new Fractions(c, d);

            if (abcd.contains(" + ")) {
                System.out.println(f1.sum(f1.num, f1.den, f2.num, f2.den));
            }
            if (abcd.contains(" - ")) {
                System.out.println(f1.sub(f1.num, f1.den, f2.num, f2.den));
            }
            if (abcd.contains(" * ")) {
                System.out.println(f1.mul(f1.num, f1.den, f2.num, f2.den));
            }
            if (abcd.contains(" : ")) {
                System.out.println(f1.div(f1.num, f1.den, f2.num, f2.den));
            }
        }

    }


}
