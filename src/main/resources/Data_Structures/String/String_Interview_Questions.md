# String Interview Questions:

### Reversing a String:
* Write a function that **reverses a string**
* The input string is given as an **array of characters `s`**
* You must do this by modifying the input array **in-place** with `O(1)` extra memory
* **Example 1:**
  * **Input:** `s = ["h","e","l","l","o"]`
  * **Output:** `["o","l","l","e","h"]`
* **Example 2:**
  * **Input:** `s = ["H","a","n","n","a","h"]`
  * **Output:** `["h","a","n","n","a","H"]`
```
public void reverseString(char[] s) {
  for(int i = 0; i < s.length / 2; i++) {
      char temp = s[i];
      s[i] = s[s.length - 1 - i];
      s[s.length - 1 - i] = temp;
  }
}
```

### Reversing an Integer:
* Given a **signed 32-bit integer `x`**, return `x` with its **digits reversed**
* If reversing `x` causes the value to go **outside the signed 32-bit integer range `[-2^31, 2^31 - 1]`**, then **return 
  0**
* Assume the environment **does not allow you to store 64-bit integers** (signed or unsigned)
* **Example 1:**
  * **Input:** `x = 123`
  * **Output:** `321`
* **Example 2:**
  * **Input:** `x = -123`
  * **Output:** `-321`
* **Example 3:**
  * **Input:** `x = 120`
  * **Output:** `21`
* **Constraints:**
  * `-2^31 <= x <= 2^31 - 1`
```
public static int reverse(int x) {
    int result = 0;

    while (x != 0) {
        int digit = x % 10;
        if (result > Integer.MAX_VALUE / 10 
            || (result == Integer.MAX_VALUE / 10 
            && digit > 7)) {
            return 0;
        }
        if (result < Integer.MIN_VALUE / 10 
            || (result == Integer.MIN_VALUE / 10 
            && digit < -8)) {
            return 0;
        }
        result = result * 10 + digit;
        x /= 10;
    }

    return result;
}
```
* **Implementation Steps:**
  * **Initialize** an `int result` variable to **0**
  * While the input integer, `x` is not equal to 0:
    * **Extract** the **last `digit`** of `x` with `x % 10`
    * **To check for overflow/underflow:**
      * **If** `result` is greater than the **max Integer value divided by 10**, **or if** `result` is **equal** to the 
        **max Integer value divided by 10** and the **last digit is greater than 7**, **return 0**, as it is **outside 
        the signed 32-bit integer range**
      * **If** `result` is less than the **min Integer value divided by 10**, **or** if `result` is equal to the **min Integer
        value divided by 10** and the **last digit is less than -8**, return 0, as it is outside the signed 32-bit
        integer range
        * In a signed 32-bit integer, the **maximum positive value** that can be represented is `2^31 - 1` (which is 
          `2147483647`) and the minimum negative value is `-2^31` (which is `-2147483648`)
    * **Reverse the Integer by Handling Each Digit:**
      * `result = result * 10 + digit;`
        * Initially, `result` is 0
        * **For each iteration:**
          * Multiplying `result` by 10 **shifts its digits to the left**, **making room** for the **next digit**
          * **Adding the current `digit` to `result` at the units place effectively places the digit at the end of 
            the reversed number**
          * This process **repeats** until **all digits have been processed**, resulting in a **reversed integer**
    * **Remove the last digit from the original integer, `x`:**
      * `x /= 10;`
      * This line is used to **remove the last digit** from the **original integer `x`**
      * **After extracting the last `digit`**, `x /= 10` performs **integer division by 10**, **effectively 
        removing** the **last digit from `x`**

### First Unique Character in a String:
* Given a string `s`, find the **first non-repeating character** in it and **return its index**
* If it does not exist, **return -1**
* **Example 1:**
  * **Input:** `s = "leetcode"`
  * **Output:** `0`
* **Example 2:**
  * **Input:** `s = "loveleetcode"`
  * **Output:** `2`
* **Example 3:**
  * **Input:** `s = "aabb"`
  * **Output:** `-1`
* **Constraints:**
  * 1 <= s.length <= 10^5
  * `s` consists of only lowercase English letters
* **Frequency Array (Most Efficient):**
```
public int firstUniqChar(String s) {
  // Assuming input only contains lowercase English letters
  int[] charCount = new int[26]; 

  // Count occurrences of each character
  for (char c : s.toCharArray()) {
      charCount[c - 'a']++;
  }

  // Find the index of the first character with count 1
  for (int i = 0; i < s.length(); i++) {
      if (charCount[s.charAt(i) - 'a'] == 1) {
          return i;
      }
  }
  
  // Return -1 if no unique character found
  return -1; 
}
```
* **Implementation Steps:**
  * Declare an `int` array of size 26, `charCount`
  * For each character, `c` in the string:
    * Increment index `[c - 'a']` by 1:
      * `charCount[c - 'a']++;`
      * In Java, characters are represented internally using their ASCII values
      * The character 'a' has an ASCII value of 97, 'b' has a value of 98, and so on
      * By subtracting the ASCII value of 'a' from the character's ASCII value, it effectively maps 'a' to index 0, 'b' 
        to index 1, 'c' to index 2, and so forth up to 'z' being mapped to index 25
  * 

* **Using a HashMap:**
```
public int firstUniqChar(String s) {
    Map<Character, Integer> charFreq = new HashMap();
    
    for(int i = 0; i < s.length(); i++){ 
        charFreq.put(s.charAt(i), charFreq.getOrDefault(s.charAt(i), 0) + 1);
    }
    
    for(int i = 0; i < s.length(); i++){ 
        if(charFreq.get(s.charAt(i)) == 1){
            return i;
        }
    }
    
    return -1;
}
```

### Valid Anagram:
* Given two strings `s` and `t`, return true if t is an anagram of s, and false otherwise
* An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all 
  the original letters exactly once
**Example 1:**
  * **Input:** `s = "anagram", t = "nagaram"`
  * **Output:** `true`
* **Example 2:**
  * **Input:** `s = "rat", t = "car"`
  * **Output:** `false`
* **Constraints:**
  * `1 <= s.length`, `t.length <= 5 * 10^4`
  * `s` and `t` consist of lowercase English letters
* **Follow up:**
  * What if the inputs contain Unicode characters?
  * How would you adapt your solution to such a case?
```
public boolean isAnagram(String s, String t) {
  if (s.length() != t.length()) {
    return false;
  }
  
  int[] letters = new int[26];
  Arrays.fill(letters, 0);

  for (int i = 0; i < s.length(); i++) {
      letters[s.charAt(i) - 97]++;
  }

  for (int i = 0; i < t.length(); i++) {
      letters[t.charAt(i) - 97]--;
  }

  for (int i = 0; i < 26; i++) {
      if (letters[i] != 0) {
        return false;
      }  
  }

  return true;
}
```
