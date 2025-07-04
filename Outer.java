public class Outer {
    static int outerStaticVar = 10;

    private int outerInstanceVar = 20;

    static class StaticNested {
        void display() {
            System.out.println("Outer static variable: " + outerStaticVar);
        }
    }

    class Inner {
        void display() {
            System.out.println("Outer instance variable: " + outerInstanceVar);
        }
    }
}
