import java.util.*;

class q1 {
    // main method
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 4, 76, 4, 3, 12, 6 };
        int[] arr2 = { 3, 4, 5, 4, 76, 53, 6 };
        int[] arr3 = { 3, 4, 3, 12, 6 };
        int len = arr.length;
        String str = "Hello World this is tenzin and I am a software engineer";

        System.out.printf("Therefore avg is %d\n", Avg(arr, len));
        System.out.println("Second Largest: " + SecondLargestEle(arr, len));
        SwapFirstNLastEle(arr, len);
        CountVowelsAndConsonants(str);
        commonEle(arr, arr2, arr3);
        capFirstLetter(str);

    }

    // q1 write a program to find average of array elements
    public static int Avg(int[] arr, int len) {
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[1];
        }
        int avg = sum / len;
        return avg;
    }

    // q2 Find the second largest elements in an array
    public static int SecondLargestEle(int[] arr, int len) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            } else {
                continue;
            }
        }
        return max2;
    }

    // q3 write a program to calculate the products of two integers.
    // q4 Swap first and last elements in given elements
    public static void SwapFirstNLastEle(int[] arr, int len) {
        int[] arr1 = arr;
        int temp = arr1[0];
        arr1[0] = arr1[len - 1];
        arr1[len - 1] = temp;
        System.out.println(temp);
        for (int i = 0; i < len; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    // q5 Write a java program count vowels and consonants in a string
    public static void CountVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("\n Vowels: " + vowels + ", Consonants: " + consonants);
    }

    // q6 Write a java program to replace every element with the next greatest
    // q7 Find common elements in 3 arrays
    public static void commonEle(int[] arr1, int[] arr2, int[] arr3) {
        int[] common = new int[100];
        int index = 0;
        for (int a : arr1) {
            boolean foundInB = false;
            boolean foundInC = false;

            for (int b : arr2) {
                if (a == b) {
                    foundInB = true;
                    break;
                }
            }
            for (int c : arr3) {
                if (a == c) {
                    foundInC = true;
                    break;
                }
            }
            if (foundInB == true && foundInC == true) {
                boolean alredyAdded = false;
                for (int i = 0; i < index; i++) {
                    if (common[i] == a) {
                        alredyAdded = true;
                        break;
                    }
                }
                if (!alredyAdded) {
                    common[index++] = a;
                }
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(common[i] + " ");
        }
    }

    // Write a java program to capitalize first letter of each word
    public static void capFirstLetter(String str) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                if (str.charAt(i) == ' ' && index != i) {
                    String slice = str.substring(index, i + 1);
                    char ch = str.charAt(i + 1);
                    result.append(slice + Character.toUpperCase(ch));
                    index = i + 2;
                    i += 2;
                    System.out.println(Character.toUpperCase(ch));
                }
            }
        }
        String slice = str.substring(index, str.length());
        result.append(slice);
        System.out.println("\n" + result);
    }
    // Write a java program to print duplicate characters in given string

}

// Write a java program to remove all white spaces
// Find the counts of words in a string
// Write a java program to count inversions in an array
// Reverse an array
// Find the repeating and missing number in given elements
// write a java program to calculate the sum of given array of elements
// Merge two strings in a singly array
// Write a java program to concatenate two strings
// sum of factorials of all integers

// Find the highest element in given array

// Reverse a string
// Find longest repeating subsequence
// sum of all the numbers from 1 to N
// Find all substrings of a string
// Find the frequency of each element in given array
// Remove all special characters
// sort the characters of any word in alphabetically
// Find the greatest of two numbers
// sum of all the squares of all the prime numbers
// Rotate an array in right position
// Check if number is divisible by 5 and 11
// Remove the duplicates characters in given string
// Armstrong number
// Count number of digits in a number
// Find minimum number of swaps to sort an array
// Write a program to find all the unique pairs of items for given sum value
// Calculate LCM of two numbers
// Write a java program to print diamond pattern
// Calculate factorial of a number
// Write a java program to calculate find the square and cube of a number
// Reverse a number
// Check if number is prime or not
// Check if array contains a duplicate within k distance
// Rearrange array in alternating positive and negative
// Find the element with left and right equal sum
// Find the subarray with a given sum
// Check if a pair exists with given sum in sorted array
// Check if two strings are rotations of each other
// Extract numbers from a strings
// Find the longest word in a sentence
// Replace each character with the next character