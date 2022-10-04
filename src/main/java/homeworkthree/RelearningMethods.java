package homeworkthree;

import java.util.Arrays;

public class RelearningMethods {
    //Question 4
    public static String getLastElement(String[] names) {
        //asking for a string of names and return the last element back
        //create an empty string to return the last element
        String lastName = " ";
        //looping through string[]
        for(int x = 0; x < names.length; x++){
            //just return the last element
            lastName = names[x];
        }
        return lastName;
    }

    //put psvm here because method is static
//    public static void main(String[] args) {
//        String[] names = {"Emily", "B", "Kyle", "Saad", "Isaiah", "Josh"};
//        System.out.println(getLastElement(names));
//    }

    //Question 5
    public static String getSecondToLastElement(String[] names) {
        //asking to take a string of names and return second to last element
        //created a string to hold the second to last element
        String holdSecondToLast = " ";
        //loop through names string
        for(int x = 0; x < names.length - 2; x++){ //put -2 because it's looping through index # - 2
            //we want the second to last element
            holdSecondToLast = names[x];
        }
        return holdSecondToLast;
    }

//    public static void main(String[] args) {
//        String[] names = {"Emily", "B", "Kyle", "Saad", "Isaiah", "Josh", "Kai"};
//        System.out.println(getSecondToLastElement(names));
//    }

    //Question 6
    public static int getSum(int[] ints) {
        //it takes an array of numbers and wants use to return the sum of numbers
        int sumOf = 0;
        for(int x = 0; x < ints.length; x++){
            sumOf = Arrays.stream(ints).sum(); //used a method that said sum
        }
        return sumOf;
    }

//    public static void main(String[] args) {
//        int[] ints = {1, 2, 3, 4};
//        System.out.println(getSum(ints));
//    }

    //Question 7
    public static int getAverage(int[] ints) {
        //method wants to take in array of ints that will return an average of numbers
        int storeAverage = 0;
        for(int x = 0; x < ints.length; x++){
            int storeSum = Arrays.stream(ints).sum();
            storeAverage = storeSum / ints.length;
        }
        return storeAverage;
    }

//    public static void main(String[] args) {
//        int[] ints = {5, 2, 3};
//        System.out.println(getAverage(ints));
//    }

    //Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        //asking to take in array of numbers and wants to return a string of odd numbers
        String returnOdds = " ";
        for(int x = 0; x < numbers.length; x++){
            //check if index position element is / 2 with a remainder that != to 0
            if(numbers[x] % 2 != 0){
                returnOdds += " " + numbers[x];
            }
        }
        return returnOdds;
    }

//        public static void main(String[] args) {
//        int[] ints = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(extractAllOddNumbers(ints));
//    }


    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String evenOnly = " ";
        for(int x = 0; x < numbers.length; x++){
            if(numbers[x] % 2 == 0){
                evenOnly += " " + numbers[x];
            }
        }
        return evenOnly;
    }

//    public static void main(String[] args) {
//        int[] ints = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(extractAllEvenNumbers(ints));
//    }

    //Question 10
    public static boolean contains(String[] names, String element) {
        //this method takes in a list of names and wants to check if one element is there or not
        for(int x = 0; x < names.length; x++){
            if(names[x].contains(element)){
                return true;
            }
        }
        return false;
    }

//    public static void main(String[] args) {
//        String[] names = {"Emily", "Kai", "Bai", "Emmers"};
//        System.out.println(contains(names, "Emily"));
//    }

    //Question 11
    public static int getIndexByElement(String[] names, String element) {
        //this method is looping through a string of names and returns the index of an element
        int returnElementIndex = 0;
        for(int x = 0; x < names.length; x++){
            if(names[x].contains(element)){
                returnElementIndex = x;
            }
        }
        return returnElementIndex;
    }

//    public static void main(String[] args) {
//        String[] names = {"Emily", "Kai", "Bai", "Emmers"};
//        System.out.println(getIndexByElement(names, "Bai"));
//    }

    //Question 12
    public static void printOddNumbersInRange(int start, int end){
        //this isn't returning anything, so you need to print out
        //asking for a starting int and ending int and it will print the odd numbers only
        for(int x = start; x <= end; x++){
            if(x % 2 != 0){
                System.out.println(x);
            }
        }
    }

//    public static void main(String[] args) {
//        printOddNumbersInRange(21, 35);
//    }

    //Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        //the method is taking a string and printing it however many number of times you want to
        String printTimes = str.repeat(n);
        return printTimes;
    }

//    public static void main(String[] args) {
//        System.out.println(printGivenStringTimesNumberGiven("Emily", 6));
//    }

    //Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        //method that wants to return the first three letters of any string at x amount of times
        String threeLetters = str.substring(0, 3).repeat(n);
        return threeLetters;
    }

//    public static void main(String[] args) {
//        System.out.println(repeatFirstThreeLetters("Emily", 2));
//    }

    //Question 15
    // Write a java method to count all the words in a string
    public static int WordsInAStringCounter(String str){
        int returnNumbers = str.length();
        return returnNumbers;
    }

//        public static void main(String[] args) {
//        System.out.println(WordsInAStringCounter("Emmers"));
//    }

    //Question 16
    //A, E, I, O, U, and sometimes Y
    public static int vowelsCounter(String str) {
        //method is asking for a string and it will return the number of vowels
        int count = 0;
        for(int x = 0; x < str.length(); x++){
            if(str.charAt(x) == 'a' || str.charAt(x) == 'A'){
                count = count + 1;
            }
            if (str.charAt(x) == 'e' || str.charAt(x) == 'E'){
                count = count + 1;
            }
            if (str.charAt(x) == 'i' || str.charAt(x) == 'I'){
                count = count + 1;
            }
            if (str.charAt(x) == 'o' || str.charAt(x) == 'O'){
                count = count + 1;
            }
            if (str.charAt(x) == 'u' || str.charAt(x) == 'U'){
                count = count + 1;
            }
            if (str.charAt(x) == 'y' || str.charAt(x) == 'Y'){
                count = count + 1;
            }
        }
        return count;
    }

//    public static void main(String[] args) {
//        System.out.println(vowelsCounter("Emilia"));
//    }

    //Question 17
    //Swap the first element in an array with the last element in an array and return
    public static String[] swap(String[] stringArray) {
        String first = " ";
        String last = " ";
        for(int x = 0; x < stringArray.length; x++){
            first = stringArray[0];
            last = stringArray[x];
        }
        String[] returnLast = {first, last};
        return returnLast;
    }

//    public static void main(String[] args) {
//        String[] stringArray = {"Emily", "Kai", "Bai", "Emmers", "E", "Ems"};
//        System.out.println(Arrays.toString(swap(stringArray)));
//    }

    //Question 18
    /**
     * Given the following legend
     *
     * f   >>   7
     * s   >>   $
     * 1   >>   !
     * a   >>   @
     *
     * your method should replace any character represented by a key in the legend, with its corresponding value.
     * Input  = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
     * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"
     */
    public static String replaceCharacters(String str) {
        //method takes in a string and then reads through the string and replaces certain words
        String returnNewChar = " ";
        if(str.contains("f")){
            returnNewChar = str.replaceAll("f", "7");
        }
//        if(str.contains("s")){
//            returnNewChar = str.replaceAll("s", "$");
//        }
        return returnNewChar;
    }

    public static void main(String[] args) {
        System.out.println(replaceCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer"));
    }
    //Question 19
    //" The small brown dog hopped the fence " becomes " The Wu Tang Wu Hopped Wu Fence "
    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        return null;
    }
    //Question 20
    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        return null;
    }


}

