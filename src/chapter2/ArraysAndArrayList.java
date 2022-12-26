package chapter2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAndArrayList {

    public static void main(String[] args) {
        // arrays can hold primitive data types and also Strings and objects
       // String [] friendsArray = new String[4];// array size is fixed
        // elements will be [0][1][2][3]
        // create
        String[] Friend = {"Awa", "mustapha", "Rahma", "Modou"};// array literals

        System.out.println(Friend[1]);
        System.out.println(Friend.length);// gives the size of the array
        System.out.println(Arrays.toString(Friend));
// set an element
        Friend[0] = "Aisah";
        System.out.println(Friend[0]);


        System.out.println("---------------------------------------------------------------------------");
        //ArrayList
// ArrayList can only hold objects, but supports wrapper types for primitives
      //  ArrayList<String> friends1 = new ArrayList<>();// dynamic

        ArrayList<String> friends2 = new ArrayList<>(Arrays.asList("Awa", "mustapha", "Rahma", "Modou"));
        System.out.println(friends2.get(1));
        System.out.println(friends2.size());// size() tells us the size pf the arrayList

        // adding more elements
        // cannot be done with an array

        friends2.add("Sarjo");
        System.out.println(friends2);

        System.out.println(friends2.get(4));
        // set an element
        friends2.set(0,"Mariam");
        System.out.println(friends2.get(0));
//      remove elements

        friends2.remove("Rahma");
        System.out.println(friends2);


    }
}
