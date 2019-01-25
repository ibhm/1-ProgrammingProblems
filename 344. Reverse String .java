class Solution {
    public void reverseString(char[] s) {
        int j = s.length-1;
        int i = 0;
        while(i<j){ //iterate through the list till i and j are the same. i is from left update, j is from rght update
            char temp = s[i];  
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}