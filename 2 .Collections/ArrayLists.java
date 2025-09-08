import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //Add Elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //To get an Element
        int element = list.get(0); // o is the index
        System.out.println(element);

        //Add element in between
        list.add(1,2); // 1 is the index and 2 is the element to be added
        System.out.println(list);

        //set element
        list.set(0,0);
        System.out.println(list);

        // delete elements
        list.remove(0); // 0 is the index
        System.out.println(list);

        //size of Arraylist
        int size = list.size();
        System.out.println(size);

        //Loops on Arraylists-> .size()
        for (int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();

        //Sorting in ArrayList-> Collectios.sort(ArrayListName)
        list.add(0);
        Collections.sort(list);
        System.out.println(list);

//!         | Operation | ArrayList                    | StringBuilder                    |
// | --------- | ---------------------------- | -------------------------------- |
// | Push      | `list.add(element)`          | `sb.append(char)`                |
// | Pop       | `list.remove(list.size()-1)` | `sb.deleteCharAt(sb.length()-1)` |

//! Iterating in ArrayList
    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
    }
    //! Converting Array to ArrayList
    Integer[] arr = {1, 2, 3};
    ArrayList<Integer> ls = new ArrayList(Arrays.asList(arr));  // ✅ VALID

    //! Iterating in StringBuilder
    // for (int i = 0; i < sb.length(); i++) {
    //     System.out.println(sb.charAt(i));
    // }


    }
}
