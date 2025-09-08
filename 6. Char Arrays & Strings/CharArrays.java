//! In Java, a character array is a data structure used to store a sequence of characters.
//! The characters are stored in contiguous memory locations and can be accessed by their index, similar to an array of integers or any other data type.

//!--Declaring a Character Array--
//! A character array can be declared in the following way:

//char[] charArray;
//charArray = new char[10];
//char[] charArray = new char[10];
//char[] charArray = {'a', 'b', 'c', 'd', 'e'};

//!--Iterating Over a Character Array--
//! You can use a for loop to iterate over the elements of a character array. For example:

//for (int i = 0; i < charArray.length; i++) {
//    System.out.println(charArray[i]);
//}
//This prints each element of the charArray on a new line.

//! Another way to iterate over a character array is to use the enhanced for loop (also known as the for-each loop):

//for (char c : charArray) {
//    System.out.println(c);
//}

//! --Comparing Character Arrays--
//! To compare two character arrays for equality, you can use the Arrays.equals() method:

//char[] charArray1 = {'a', 'b', 'c', 'd', 'e'};
//char[] charArray2 = {'a', 'b', 'c', 'd', 'e'};
//
//if (Arrays.equals(charArray1, charArray2)) {
//	System.out.println("The arrays are equal.");
//} else {
//	System.out.println("The arrays are not equal.");
//}

//! --Converting a String to a Character Array--
//! We can convert a String to a character array using the toCharArray() method:

//String str = "Hello World";
//char[] charArray = str.toCharArray();


//! --Converting a Character Array to a String--
//! We can convert a character array to a String using the String constructor that takes a character array as an argument:

//char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
//String str = new String(charArray);

//!--Note that, while you can use the “==” operator to compare the references of two arrays, it will not compare the elements of the arrays.
//! So if you want to compare the two arrays, you should use the Arrays.equals(arr1, arr2) method, which returns true if the two arrays are equal, and false otherwise.

//!--copyOf() method from the Arrays class:-- This method creates a new array with the same length as the original array and copies the elements from the original array to the new array.
// It can be used to make a copy of a character array, which is useful when you want to make changes to the original array without affecting the original data.

//! Example of copyOf() method:

//char[] originalArray = {'a', 'b', 'c', 'd', 'e'};
//char[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);

//!--copyOfRange() method from the Arrays class:-- This method creates a new array with the specified range of elements from the original array and copies the elements from the original array to the new array.
// It can be used to make a copy of a specific range of elements in a character array.

//! Example of copyOfRange() method:

//char[] originalArray = {'a', 'b', 'c', 'd', 'e'};
//char[] copiedArray = Arrays.copyOfRange(originalArray, 1, 4);
//Here, the elements of the originalArray are copied from index 1 to index 3 to the copiedArray.
public class CharArrays {
}
