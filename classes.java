public class Fractions {
    int num;
    int den;

    public Fractions(int fnum, int fden) {
        num = fnum;
        den = fden;
    }

    public void printondisplay() {
        if (den != 0) {
            System.out.println(num + "/" + den);
        }
        if (den == 0) {
            System.out.print("Такой дроби не существует");
        }
    }
    public String sum(int num1, int den1, int num2, int den2) {
        return ((num1*den2)+(num2*den1) + "/" + (den1 * den2));
    }

    public String sub(int num1, int den1, int num2, int den2) {
        return ((num1*den2)-(num2*den1) + "/" + (den1 * den2));
    }


    public String mul(int num1, int den1, int num2, int den2) {
        return ((num1*num2) + "/" + (den1 * den2));
    }

    public String div(int num1, int den1, int num2, int den2) {
        return ((num1*den2) + "/" + (den1 * num2));
    }


}



