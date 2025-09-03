public class Rabbit {
    public static void main(String[] args) {
        Rabbit one = new Rabbit(); // Rabbit1
        Rabbit two = new Rabbit(); // Rabbit2
        Rabbit three = one;
        one = null;
        Rabbit four = one;
        three = null;
        two = null;
        two = new Rabbit();
        System.gc();
    }
}