import java.util.*;
public class StringLecture {
    public static void main(String[] args) {
        // String s1 = "Hello";
        // String s2 = "Hello";

       

        // String s3 = new String("Hello");
        //  System.out.println(s1 == s2);
        //  System.out.println(s1 == s3);
        //  System.out.println(s1.equals(s3));

    //     String s1 = "Hello";
    //    s1 =  s1.concat("    World");
    //     // System.out.println(s1);


        // System.out.println(s1.length());
        // System.out.println(s1.toUpperCase());
        // System.out.println(s1.isEmpty());
        // System.out.println(s1.trim());


        // stringBuilder and StringBuffer
        // StringBuilder sb = new StringBuilder("Hello");
        // sb.append(" World");
        // System.out.println(sb);



// Arrays : collection of similar elements
        
// int marks[] = {10,20, 30, 40, 50};


// for(int i=0; i<marks.length; i++){
//     System.out.println(marks[i]);
// }


// count vowels in a String

// String str = "Java Programming";

// for(){
//     char ch = str.charAt(i)

//     if(ch == a, ch)

// }

// int marks[] = {10,20, 30, 40, 50, 60 , 70};

// input from user
// size = number of elements in an array
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the size of array");
// int size = sc.nextInt();
// int arr[] = new int[size];

// System.out.println("Enter elements");
// for(int i=0; i<size; i++){
// arr[i] = sc.nextInt();
// }

// System.out.println("Enter the element to search");
// int key = sc.nextInt();

// // searching

// boolean found = false;
// int index = -1;
// for(int i=0; i<size; i++){
//     if(key == arr[i] ){
        
//         found = true;
//         index = i;
//     }
//     }
    
//     if(found){
//         System.out.println("Element  found at index " + index);
//     }else {
//         System.out.println("Element not found");
//     }


// output : 30 , element found at index 2

// System.out.println("These are the elements");
// for(int i=0; i<size; i++){
// System.out.println(arr[i]);
// }

// reverse a string

// String s1 = "Hello World"; // 

// String[] words = s1.split(" ");

// System.out.println("the reverse string is ");
// // for(int i=words.length()-1; i>=0; i--){
// // System.out.print(words.charAt(i));
// // }

// for(String word:words){
//     for(int i=word.length()-1; i>=0; i--){
// System.out.print(word.charAt(i));
// }
// System.out.println();

// }
// Given - ANKIT BALIYAN 
// OUT PUT - TIKNA NAYILAB


//

// sorting an array

int arr[] = {30, 20, 100, 16, 89, 21, 56};

for(int i=0; i<arr.length-1; i++){
    for(int j=i+1; j<arr.length; j++ ){
        if(arr[j] > arr[i]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}

System.out.println("array in ascending order");{
    for(int i=0; i<=arr.length-1; i++){
        System.out.print(arr[i]+ " ");
    }
}








}
}






