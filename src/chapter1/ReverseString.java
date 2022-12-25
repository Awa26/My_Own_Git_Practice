package chapter1;

public class ReverseString {

    public static void main(String[] args) {

        String str = "raceCar, Awa, madam, Sarjo ";
        System.out.print("Original word: ");
        System.out.println("raceCar");
        String res = "";
        char ch ;// char variable to store the characters
        for (int i = str.length()-1; i>=0; i-- ){
            ch = str.charAt(i);//extracts each character
            res+=ch; //adds each character in front of the existing string
        }
        System.out.println("Reverse words are: " + res);
    }
// hello updates
   /*
     public static String reverseString(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);

        }
            return result;

    }
    */
}
