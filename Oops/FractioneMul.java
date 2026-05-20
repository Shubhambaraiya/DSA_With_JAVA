public class FractioneMul {
    public static FRaction mul(FRaction f1, FRaction f2) {
        int numarator = f1.num * f2.num;
        int denominator = f1.den * f2.den;
        FRaction f4 = new FRaction(numarator, denominator);
        return f4;

    }

    public static int gcd(int num, int den) {
        int min = Math.min(num, den);
        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && den % i == 0) {
                return i;
            }
        }
        return 1;

    }

    public static class FRaction {
        int num;
        int den;

        FRaction(int num, int den) {
            this.num = num;
            this.den = den;
            makefraction();

        }

        public void makefraction() {
            int HCF = gcd(num, den);
            num = num / HCF;
            den = den / HCF;

        }
    }

    public static void main(String[] args) {
        FRaction f1 = new FRaction(5, 3);
        System.out.println(f1.num + "/" + f1.den);

        // f1.makefraction();
        // System.out.println(f1.num+"/"+f1.den);
        FRaction f2 = new FRaction(4, 3);
        System.out.println(f2.num + "/" + f2.den);

        FRaction f3 = mul(f1, f2);
        System.out.println(f3.num + "/"  +f3.den);
    }

}
