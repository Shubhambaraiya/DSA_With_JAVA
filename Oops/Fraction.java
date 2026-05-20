public class Fraction {
    public static class MakeFraction {
        int num;
        int den;

        MakeFraction(int num, int den) {
            this.num = num;
            this.den = den;
        }
        public void simplify() {
            if (num < den) {
                if (den % num == 0) {
                    den = den/num;
                    num = 1;
                    return;
                }
            }
        }

    }


    public static void main(String[] args) {
        MakeFraction f1 = new MakeFraction(3, 9);
        System.out.println(f1.num + "/" + f1.den);
        f1.simplify();
        System.out.println(f1.num + "/" + f1.den);

        // MakeFraction f2 = new MakeFraction(4, 12);
        // System.out.println(f2.num+"/"+f2.den);
    }

}