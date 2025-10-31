public class Functions {

    // public static int addNumbers(int a, int b){
    //     int sum= a+b;
    //     System.out.println("Sum of numbers");
    //     return sum;
    // }
    // public static  void main(String[] args) {
    //     System.out.println("We are learning function");
    //    int result =  addNumbers(10, 20);
    //    System.out.println(result);
    // }

    // public static void printNum(int n){

    //     if(n==0){
    //         return;
    //     }

    //     System.out.println(n);
    //     printNum(n-1);

    // }

    // public static void main(String[] args) {
    //     int n = 5;
    //     printNum(n);
    
        // to print sum of first 5 numbers using recursion


        // to find the factorial of a number


    //     public static int factorial(int n){

    //         if(n==1 || n==0){
    //             return 1;
    //         }

    //         int fact= factorial(n-1);
    //         int i= n*fact;
    //         return i;
    //     }


    // public static void main(String[] args) {
    //     int n=5;
    //     int ans = factorial(n);
    //     System.out.println("The factorial of 5 is " +ans);




    public static void printfib(int a, int b, int n){

        if(n==0){
            return;
        }

        int c= a+b;
        System.out.println(c);
        printfib(b, c, n-1);


    }
    public static void main(String[] args) {
        int a=0, b=1;
        System.out.println(a);
        System.out.println(b);
        int n= 8;
        printfib(a, b, n-2);
        
    }

    }
    




