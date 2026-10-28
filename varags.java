public class varags {
    static void main(String[] args) {

        /*
        varargs = allow a method to ccept a varying no of arguments
                     make methods more flexible, no need for overloaded methods
                    java will pack the arguments into an arrays
                     ... (ellipsis)


        System.out.println(add(1,2,3,4));



    }
    static int add(int... numbers ) {

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;

         */

        System.out.println(average(1,2,3,4,5,7));
    }
        static double average(double... numbers){

            double sum = 0;

            for (double number : numbers){
                sum += number;

            }
            return sum/numbers.length;
    }


}
