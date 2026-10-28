public class overloadmethod {

    static void main() {

        //overload methods = methods that share the same name, but different parameters
        //                                  signature = name + parameters

        /*
        System.out.println(add(1 , 2));

    }
    static double add(double a, double b) {
        return a + b;

         */

        String pizza = bakePizza("flat bread", "mozzarella", "papperoni");
        System.out.println(pizza);
    }
    static String bakePizza(String bread) {
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
