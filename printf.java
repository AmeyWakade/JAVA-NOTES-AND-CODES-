public class printf {
    static void main() {

        //printf() = is method used to format output
        //%[flags] [widhth][.precision] [specifier-character]

        String name ="Spider man" ;
        char firstLetter ='S' ;
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d year old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("You are working status is %b\n", isEmployed);

        
    }

}
