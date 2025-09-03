public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("isa \n");
        two = new String("dalawa \n");
        one = two;
        String three = one;
        one = null;
        System.out.println(one + "\n" + two + three);
        one = "dalawa";
        two = one;
        
        System.out.println(one + two);
        String yes = "yes";

        System.out.println("\n" + yes );
    }
}
