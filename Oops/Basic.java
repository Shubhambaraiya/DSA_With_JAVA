public class Basic {

    public static class Student{
        int age ;
        String name;

    }
    public static void main(String []args){
Student p = new Student();

p.age = 15;
p.name = "Shubham";
Student s = new Student();
s.age = 18;
s.name = "Satyam";
System.out.println(s.age);
    }
}
