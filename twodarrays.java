public class twodarrays {
    static void main(String[] args) {

        //2d arrays=  an array where each element is an array
        //             Useful for storing a matrix of data


        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"ptato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "fish"};

        String[][] groceries = {fruits, vegetables, meats};

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

    }
}
