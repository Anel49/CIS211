public class TextProcessor {

    public static char[] stringToArray(String input) {
      char[] inputArray = new char[input.length()];
      // for loops adds input's character at i to the array
      for (int i = 0; i < input.length(); ++i){
        inputArray[i] = input.charAt(i);
      }
      return inputArray;
    }  
 
    public static String arrayToString(char[] input) {
      String inputStr = "";
      /* for loop adds the input's char to inputStr as
      a string
      */
      for (int i = 0; i < input.length; ++i){
        inputStr += input[i];
      }
      return inputStr;
    }
 
    public static int numOccurrences(char c, String str) {
      int numOcc = 0;
      /*
      for loop increments var numOcc each time it encounters
      the character in the string and then returns numOcc
      */
      for (int i = 0; i < str.length(); i++){
        if (str.charAt(i) == c){
          numOcc++;
        } 
      }
      return numOcc;
    }

    public static double freqOccurrence(char c, String str) {
      /*
      uses numOccurrences to grab the amount of times c is
      found in str and, if it is not zero, divides that number
      by the length of the string
      */
      double numOcc = numOccurrences(c, str);
      if (numOcc != 0.0){
        numOcc = numOcc / str.length();
      }
      return numOcc;
    }
 
    public static char mostFrequent(String str) {
      int temp = 0;
      char maxChar = (char) 0;
      String charStr = "";
      /*
      if charStr does not have str's character at i,
      adds str's character at i to charStr to create
      a string that has only one instance of str's
      original letters
      */
      for (int i = 0; i < str.length(); i++){
        if (!charStr.contains("" + str.charAt(i))){
          charStr += "" + str.charAt(i);
        }
      }
      /*
      for loop interates through final charStr and uses
      numOccurrences to return the amount of occurrences
      for each character. if res is greater than temp,
      assign temp to res and maxChar with charStr's current
      i
      */
      for (int i = 0; i < charStr.length(); i++){
        int res = numOccurrences(charStr.charAt(i), str);
        if (res > temp){
          temp = res;
          maxChar = charStr.charAt(i);
        }
      }
      return maxChar;
    }

    public static int closest(double v, double[] values) { 
      double temp = 0.0;
      double min = 0.0;
      int minInd = 0;
      // return -1 if the length is 0 as per the instructions
      if (values.length == 0){
        minInd = -1;
      }
      else {
        for (int i = 0; i < values.length; i++){
          /*
          if v is greater than values' i, subtract i
          from v, else subtract v from i
          */
          if (v > values[i]){
            temp = v - values[i];
          }
          else if (v < values[i]){
            temp = values[i] - v;
          }
          /*
          the first iteration assigns min to temp
          and minInd to i
          */
          if (i == 0){
            min = temp;
            minInd = i;
          }
          /*
          set min to temp if temp is smaller
          than min and set minInd to i
          */
          else if (temp < min){
            min = temp;
            minInd = i;
          }
        }
      }
      return minInd;
    }
 
    public static char letterGuess(char c, String str) {
      // uses freqOccurrence to assign freqOcc
      double freqOcc = freqOccurrence(c, str);
      double temp = 0.0;
      double min = 0.0;
      char letter = 'a';
      /*
      for loop uses charFrequencies' length to iterate through.
      similar to closest(), assigns temp with the difference of
      charFrequencies' i and freqOcc
      */
      for (int i = 0; i < charFrequencies.length; i++){
        if (charFrequencies[i] > freqOcc){
          temp = charFrequencies[i] - freqOcc;
        }
        else if (charFrequencies[i] < freqOcc){
          temp = freqOcc - charFrequencies[i];
        }
        /*
        again, assigns min with temp if i is zero as a start,
        but if i is past zero, assigns min to temp if temp
        is smaller than min and letter to characters' i
        */
        if (i == 0){
          min = temp;
        }
        else if (temp < min){
          min = temp;
          letter = characters[i];
        }
      }
      return letter;
    }
 
    static final char[] characters = {
      'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
      'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
    };
    static final double[] charFrequencies = { 
      /* source: https://en.wikipedia.org/wiki/Letter_frequency */
      /* a */ 0.08167, /* b */ 0.01492, /* c */ 0.02782,
      /* d */ 0.04253, /* e */ 0.12702, /* f */ 0.02228,
      /* g */ 0.02015, /* h */ 0.06094, /* i */ 0.06966,
      /* j */ 0.00153, /* k */ 0.00772, /* l */ 0.04025,
      /* m */ 0.02406, /* n */ 0.06749, /* o */ 0.07507,
      /* p */ 0.01929, /* q */ 0.00095, /* r */ 0.05987,
      /* s */ 0.06327, /* t */ 0.09056, /* u */ 0.02758,
      /* v */ 0.00978, /* w */ 0.02360, /* x */ 0.00150,
      /* y */ 0.01974, /* z */ 0.00074,
    };   

    public static boolean charSubset(String first, String second) {
      int count = 0;
      boolean ret = false;
      // ret is true if first is empty
      if (first.isEmpty()){
        ret = true;
      }
      else{
        // if second contains first's i, add to count
        for (int i = 0; i < first.length(); i++){
          if (second.contains("" + first.charAt(i))){
            count++;
          }
          /*
          if i is at first's last index and the count
          is equal to the length of first, ret is assigned
          true
          */
          if (i == (first.length() - 1)){
            if (count == first.length()){
              ret = true;
            }
          }
        }
      }
      return ret;
    }

    public static boolean containsAll(String first, String second) {
      boolean bool = false;
      // if the strings are empty, bool is true
      if (first.equals("") && second.equals("")){
        bool = true;
        return bool;
      }
      else{
        /*
        for loop uses numOccurences on both first and second
        with the characters at i, and if first has a less than
        or equal amount to second, bool is true, else it's false
        */
        for (int i = 0; i < first.length(); i++){
          if (numOccurrences(first.charAt(i), first) <= numOccurrences(first.charAt(i), second)){
             bool = true;
          }
          else {
             bool = false;
             break;
          }
        }
      return bool;
      }
    }

    public static String condenseDuplicates(String str) {
      String newStr = "";
      // if str's length is 1 then it's already condensed
      if (str.length() == 1){
        newStr += "" + str;
      }

      for (int i = 1; i < str.length(); i++){
          /*
          if at first iteration, assign newStr to
          char at 0
          */
          if (i == 1){
              newStr += "" + str.charAt(0);
          }
          /*
          if str's character at i does not equal
          the previous character of str, add str's
          i to newStr
          */
          if (str.charAt(i) != str.charAt(i-1)){
              newStr += "" + str.charAt(i);
          }
      }
      return newStr;
    }

    public static String reversedString(String str) {
      String newStr = "";
        // backwards loop to add str characters to newStr
        for (int i = (str.length() - 1); i >= 0; i--){
            newStr += str.charAt(i);
        }
      return newStr;
    }

    public static boolean isPalindrome(String str) {
      // uses reversedString to assign revStr
      String revStr = reversedString(str);
      // if revStr equals str, it's a palindrome
      if (revStr.equals(str)){
        return true;
      }
      // if it doesn't, it's not a palindrome
      else{
        return false;
      }
    }

    public static String createPalindrome(String str) {
      String newstr = "";
      String temp = "";
      String res = "";
      // if the str is already a palindrome, set res to str
      if (isPalindrome(str)){
          res = str;
      }
      else {
          /*
          for loops appends str's character at i to newstr
          and then assigns newstr to temp to be reversed. once
          str + temp is a palindrome, assign res to str + temp
          and break the loop
          */
          for (int i = 0; i < str.length(); i++){
              
              newstr += "" + str.charAt(i);
              temp = reversedString(newstr);

              if (isPalindrome(str + temp)){
                  res = str + temp;
                  break;
              }
          }
      }
      return res;
    }
    
  //*******************************************************************************************************
  /** The follwoing two methods are only for Honors section students
    * 
    */
  //********************************************************************************************************
    
  /** method 11: This method takes two input strings and returns true if the two strings are Masons. 
    * Two strings are Masons, if they contain the same set of characters but in different order.
    * For example, "Hello World" and  "World Hello" are Masons so as "Listen" and  "Silent"  and "Funeral"
    * and  "Real fun". Where as "enjoy"  and "enjoy", "Three"  and "Tree"  are not.
    */
    public static boolean isMason(String str1, String str2) {
      // DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
        throw new RuntimeException("not implemented!");  
    }

  /** method 12: This method accepts an integer and returns the inverse of the integer.
    * For example, if num=456 the method returns 654 (six hundered fifty four). Similalry 
    * if  num=100000, it returns  1 (one) and if num = -98 it reurns -89.
    */
    public static long reverseInt(long num) {
      // DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
        throw new RuntimeException("not implemented!");  
    }
    
}