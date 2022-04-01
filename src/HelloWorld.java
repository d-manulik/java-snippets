// class declaration
public class HelloWorld { // block starts
    public static void main(String args[]) {
        System.out.println("Hi, this is Pdusheen!");
        Kitty pusheen = new Kitty();
        pusheen.greeting();
    } // block ends


}

class Kitty {
    String name;
    int age;

    Kitty() {
        this.name = "Pusheen";
        this.age = 26;
    }


     void greeting() {
        System.out.println("Hi, my name is: " + this.name);
        System.out.println("And my age is: " + this.age);
    }
}