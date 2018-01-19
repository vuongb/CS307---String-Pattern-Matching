//  A1.java


/*  Student information for assignment:
 *
 *  On my honor, Bryan Vuong, this programming assignment is my own work
 *  and I have not provided this code to any other student.
 *
 *  UTEID: BKV85
 *  email address: vuong.bryan@gmail.com
 *  Grader name: Oliver Jensen
 *  Number of slip days I am using: 0
 */


//imports
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A class with two static methods for assignment 1A
 */
public class A1 {

    /**
     * main method contains some tests for methods <tt>matches</tt> and
     * <tt>mostVowels</tt>.
     * @param  args  not used
     */
    public static void main(String[] args) {
        ArrayList<Integer> result;
        ArrayList<Integer> expected = new ArrayList<Integer>();

        // test 1, matches
        result = matches("aaaa", "aaa");
        expected.add(0);
        expected.add(1);
        System.out.println("Testing matches(\"aaaa\", \"aaa\")");
        printTestResults(result, expected, 1);

        // empty expected to get it ready for next test
        expected.clear();

        // test 2, matches
        result = matches("aaa", "aaaa");
        System.out.println("Testing matches(\"aaa\", \"aaaa\")");
        printTestResults(result, expected, 2);

        // test 3, matches
        result = matches("aabbaabbaa", "abb");
        expected.add(1);
        expected.add(5);
        System.out.println("Testing matches(\"aabbaabbaa\", \"abb\")");
        printTestResults(result, expected, 3);
        expected.clear();

        //test 4, matches
        result = matches("babcabc", "abc");
        expected.add(1);
        expected.add(4);
        System.out.println("Testing matches(\"babcabc\", \"abc\")");
        printTestResults(result, expected, 4);
        expected.clear();


        // test 5, matches
        result = matches("aaaabaaaa", "aaa");
        expected.add(0);
        expected.add(1);
        expected.add(5);
        expected.add(6);
        System.out.println("Testing matches(\"aaaabaaaa\", \"aaa\")");
        printTestResults(result, expected, 5);
        expected.clear();


        // test 6, matches
        result = matches("aaabaaabaaabaa", "aab");
        expected.add(1);
        expected.add(5);
        expected.add(9);
        System.out.println("Testing matches(\"aaabaaabaaabaa\", \"aab\")");
        printTestResults(result, expected, 6);
        expected.clear();


        // test 7 mostVowels
        String[] sList = {"aaaaaaa", "aieou"};
        int expectedResult = 0;
        int actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 7, mostVowels");
        else
            System.out.println("failed test 7, mostVowels");

        
        // test 8 mostVowels
        sList = new String[] {"Staying", null, "", "moo", "SEqUOIA NAtIOnAl FOrEst", "!!!!>>+_)(*&^%$#@!>)))???\\///\n\n/n"};
        expectedResult = 4;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 8, mostVowels");
        else
            System.out.println("failed test 8, mostVowels");
        
        
        // test 9 mostVowels
        sList = new String[] {null, null, "100,000,000", "XXX", "", "!!!!>>+_)(*&^%$#@!>)))???\\///\n\n/n", null};
        expectedResult = 2;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 9, mostVowels");
        else
            System.out.println("failed test 9, mostVowels"); 
        
        
        // test 10 mostVowels
        sList = new String[] {null, null, null, null, "", "", null};
        expectedResult = 4;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 10, mostVowels");
        else
            System.out.println("failed test 10, mostVowels");
        
 
        // test 11 mostVowels
        sList = new String[] {""};
        expectedResult = 0;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 11, mostVowels");
        else
            System.out.println("failed test 11, mostVowels");
        
        
        // test 12 mostVowels
        sList = new String[] {null, "AIBA", ""};
        expectedResult = 1;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 12, mostVowels");
        else
            System.out.println("failed test 12, mostVowels");
        
        //Beginning of Additional Test Cases
        //--------------Matches tests--------------//
        // test 13, matches
        result = matches("aaa", "aaa");
        expected.add(0);
        System.out.println("Testing matches(\"aaa\", \"aaa\")");
        printTestResults(result, expected, 13);
        expected.clear();
        
        // test 14, matches
        result = matches("baabaablacksheep", "b");
        expected.add(0);
        expected.add(3);
        expected.add(6);
        System.out.println("Testing matches(\"baabaablacksheep\", \"b\")");
        printTestResults(result, expected, 14);
        expected.clear();
        
        // test 15, matches
        result = matches("aaabaaabaaabaa", " ");
        System.out.println("Testing matches(\"aaabaaabaaabaa\", \" \")");
        printTestResults(result, expected, 15);
        expected.clear();
        
        // test 16, matches
        result = matches("/////\\", "//");
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        System.out.println("Testing matches(\"/////\\\", \"//\")");
        printTestResults(result, expected, 16);
        expected.clear();
        
        // test 17, matches
        result = matches("cscscscscscsc", "cs");
        expected.add(0);
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        System.out.println("Testing matches(\"cscscscscscsc\", \"cs\")");
        printTestResults(result, expected, 17);
        expected.clear();
        
        // test 18, matches
        result = matches("thisiscopyrightedtestcase", "copy");
        expected.add(6);
        System.out.println("Testing matches(\"thisiscopyrightedcase\", \"copy\")");
        printTestResults(result, expected, 18);
        expected.clear();
        
        // test 19, matches
        result = matches("BBBBBB", "bb");
        System.out.println("Testing matches(\"BBBBBB\", \"bb\")");
        printTestResults(result, expected, 19);
        expected.clear();
        
        //--------------Most vowels tests--------------//
        // test 20 mostVowels
        sList = new String[] {"all","work","and","no","play","makes","Hao","a","dull","boy"};
        expectedResult = 5;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 20, mostVowels\n");
        else
            System.out.println("failed test 20, mostVowels\n");
        
        // test 21 mostVowels
        sList = new String[] {"    a    ","a", "\n", ""};
        expectedResult = 0;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 21, mostVowels\n");
        else
            System.out.println("failed test 21, mostVowels\n");
        
        // test 22 mostVowels
        sList = new String[] {"Mike Scott is the best", "I am not sucking up I promise", "^_^"};
        expectedResult = 1;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 22, mostVowels\n");
        else
            System.out.println("failed test 22, mostVowels\n");
        
        // test 23 mostVowels
        sList = new String[] {"/|__/|" ,"\n                                     |^","^|", "\n                                     |_U__|"};
        expectedResult = 3;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 23, mostVowels\n");
        else
            System.out.println("failed test 23, mostVowels\n");
        
        // test 24 mostVowels
        sList = new String[] {"the quick brown fox jumped over the lazy dog", "has twelve vowels", "euiooueoeeao right?"};
        expectedResult = 2;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 24, mostVowels\n");
        else
            System.out.println("failed test 24, mostVowels\n");
        
        // test 25 mostVowels
        sList = new String[] {null, "pointer", "test", null, null};
        expectedResult = 1;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 25, mostVowels\n");
        else
            System.out.println("failed test 25, mostVowels\n");
        
        // test 26 mostVowels
        sList = new String[] {"thanks for choosing haos test", "have a great day","ps", "dont forget to turn this in"};
        expectedResult = 0;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 26, mostVowels\n");
        else
            System.out.println("failed test 26, mostVowels\n");
    }

    /**
     * Find all indices in <tt>source</tt> that are the start of a complete
     * match of <tt>target</tt>.
     * @param  source  != null, source.length() > 0
     * @param  target  != null, target.length() > 0
     * @return  an ArrayList that contains the indices in source that are the
     * start of a complete match of target. The indices are stored in
     * ascending order in the ArrayList.
     */
    public static ArrayList<Integer> matches(String source, String target) {
        // check preconditions
        assert (source != null) && (source.length() > 0)
        && (target != null) && (target.length() > 0): "Violation of precondition: method matches";

        ArrayList<Integer> result = new ArrayList<Integer>();

        //Get lengths of strings into variables
        int tarlen = target.length();
        int sourcelen = source.length();
        
        //Track tracks the amount of characters of the source string 
        //that match the target string
        int track;
        
        //Outer for loop tracks the position of the source string
        //Must subtract the length of target from source length because
        //you can't compare the target string to a fewer number of 
        //source characters
        for(int i=0; i<=(sourcelen-tarlen); i++)
        {
        	//Set or Reset Track to 0
        	track=0;
        	
        	//Inner For loop tracks the position of the target string as
        	//it compares
        	for(int j=0; j<tarlen; j++)
        	{
        		
        		//Compares characters of source and target string.
        		if(target.charAt(j) == source.charAt(i+j))
        		{
        			//Increment track if the letter at the target string
        			//and letter at the source string pointer matches
        			track++;
        			
        			//if track's number of matches count is the same as the
        			//target string's length, a match must've been made
        			if(track==tarlen)
        			{
        				//Add index of first letter to ArrayList
        				result.add(i);
        			}
        		}
        	}
        }

        return result;
    }



    /**
     * Determine the index of the String that 
     * has the largest number of vowels. 
     * Vowels are defined as <tt>'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', and 'u'</tt>.
     * The parameter <tt>list</tt> is not altered as a result of
     * this method.
     * <p>pre: <tt>list != null</tt>, <tt>list.length > 0</tt>, there is an least 1 non null element in list
     * <p>post: return the index of the non-null element in list that has the 
     * largest number of characters that are vowels.
     * If there is a tie return the index closest to zero. 
     * The empty String, "", has zero vowels.
     * It is possible for the maximum number of vowels to be 0.
     * @param list the array to check
     * @return the index of the non-null element in list that has the largest number of vowels.
     */
    public static int mostVowels(String[] list) {
        assert list != null && list.length > 0 && atLeastOneNonNull(list) : "Violation of precondition: mostVowels"; 
        String test;
        
        //index keeps track of the location with the most vowels
        int index = 0;
        //vowels holds the amount of vowels that are found as temporary storage
        int vowels;
        //vowelsave permanently holds the amount of vowels that are found by the
        //string with the most vowels
        int vowelsave = 0;
        
        //Outer for loop tracks strings in the array
        for(int k=0; k<list.length; k++)
        {
        	
        	//Get the string from the array, initialize temporary vowels variable,
        	//and ensure that string isn't null
        	test = list[k];
        	vowels=0;
        	if(test != null)
        	{
        		//Convert string to lower case, check each letter in
        		//string if it's a vowel, and increment vowel count
        		test = test.toLowerCase();
        		for(int m=0; m<test.length(); m++)
        		{
        			if(test.charAt(m)=='a' || test.charAt(m)=='e' || test.charAt(m)=='i' 
        				|| test.charAt(m)=='o' || test.charAt(m)=='u')
        			{
        				vowels++;
        			}
        		}
        		//if the amount of vowels found is greater than
        		//amount of vowels for the string counted earlier
        		//replace index and vowelsave with aspects of new string
        		//with most vowels
        		if(vowels>vowelsave)
        		{
        			index = k;
        			vowelsave = vowels;
        		}	
        	}
            
        	//If no strings have vowels and has consonants with nulls,
        	//can't return a null so must return first string
        	if(list[k] == null && (index-k) == 0)
            	index++;
        }

        return index;
    }

    /* helper method for showing results of tests
     * pre: result != null, expected != null
     */
    private static void printTestResults(ArrayList<Integer> result, ArrayList<Integer> expected, int testNum){
        System.out.println( "Expected results: " + expected );
        System.out.println( "Actual results:   " + result );
        if( result.equals( expected ) ) {
            System.out.println( "Passed test " + testNum + "." );
        }
        else {
            System.out.println( "Failed test " + testNum + "." );
        }
        System.out.println();
    }

    // pre: list != null
    // post: return true if at least one element in list is null
    // otherwise return false.
    private static boolean atLeastOneNonNull(String[] list) {
        assert list != null : "Violation of precondition: atLeastOneNonNull"; 
        boolean foundNonNull = false;
        int i = 0;
        while( !foundNonNull && i < list.length ){
            foundNonNull = list[i] != null;
            i++;
        }
        return foundNonNull;
    }

}// end of class