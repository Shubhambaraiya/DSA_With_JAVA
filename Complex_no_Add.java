public class Complex_no_Add {
    int real,image;
    Complex_no_Add(int r, int i){
        this.real = r;
        this.image = i;}

        public void show(){
            System.out.println(this.real+"+"+"i"+this.image);
        }
    public static Complex_no_Add add(Complex_no_Add c1,Complex_no_Add c2){
        Complex_no_Add result = new Complex_no_Add(0, 0);
        result.real = c1.real + c2.real;
        result.image = c1.image + c2.image;
        return result;
    }
    public static void main(String[] args) {
Complex_no_Add comp1 = new Complex_no_Add(10,6);
Complex_no_Add comp2 = new Complex_no_Add(4,3);

comp1.show();
comp2.show();

Complex_no_Add comp3 = add(comp1, comp2);
comp3.show();
    }
}
