public class Outer {
    static int outerStaticVar = 10;

    static class StaticNested {
        void display() {
            System.out.println("Outer static variable: " + outerStaticVar);
        }
    }
}
