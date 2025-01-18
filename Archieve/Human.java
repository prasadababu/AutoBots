
final class Human {
    public static void walk() {
        System.out.println("Human walks");
    }
}

class Boy {
    // public static void walk(){
    // System.out.println("Boy walks");
    // }

    public static void main(String args[]) {
        // Boy b = new Boy(); // Reference is type Human, object is type Boy
        Human h = new Human(); // Reference is type Human, object is type Human
        Human.walk(); // Human walks
        h.walk(); // Human walks
    }
}