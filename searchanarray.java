public class searchanarray {
    public static void main(String[] args) {

        int[] numbers = {1, 4, 9, 2, 5, 6, 7, 8, 3};
        String[] fruits = {"apple", "orange", "banana", "grape", "lemon", "pineapple"};
        String target = "rice";
        boolean isfound = false;

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)) {
                System.out.println("The number " + i + " is present in the array");
                isfound = true;
                break;
            }
        }

        if(!isfound){
            System.out.println("Not present in the array");
        }
    }
    }

