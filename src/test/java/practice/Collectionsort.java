package practice;

// Using Collections.sort() to sort an array 
import java.util.*;

public class Collectionsort {
    public static void main(String[] args) {
        // create an array of string objs
        String domains[] = { "Practice", "Geeks",
                "Code", "Quiz" };
        Arrays.sort(domains);
        System.out.println(domains);
        // Here we are making a list named as Collist
        @SuppressWarnings("rawtypes")
        ArrayList colList = new ArrayList(Arrays.asList(domains));

        // Collection.sort() method is used here
        // to sort the list elements.
        // Collections.sort(colList);

        // Let us print the sorted list
        System.out.println("List after the use of" +
                " Collection.sort() :\n" +
                colList);

        String str = "dcba";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        str = new String(ch);
        System.out.println(str);

    }
}