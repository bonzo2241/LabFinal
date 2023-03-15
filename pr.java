import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("123");
        String abcd = scanner.nextLine();
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

        Fractions f1 = new Fractions(a,b);
        Fractions f2 = new Fractions(c,d);

        if (abcd.contains(" + ")) {
            System.out.println(f1.sum(f1.num, f1.den,f2.num, f2.den));
        }
        if (abcd.contains(" - ")) {
            System.out.println(f1.sub(f1.num, f1.den,f2.num, f2.den));
        }
        if (abcd.contains(" * ")) {
            System.out.println(f1.mul(f1.num, f1.den,f2.num, f2.den));
        }
        if (abcd.contains(" : ")) {
            System.out.println(f1.div(f1.num, f1.den, f2.num, f2.den));
        }
    }


}