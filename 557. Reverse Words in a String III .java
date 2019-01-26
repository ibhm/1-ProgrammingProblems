class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        
        StringBuilder word = new StringBuilder();
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i)!=' '){
                word.append(s.charAt(i)); //final word is not added to sb as there is no space after final word
            }
            else{
                sb.append(word.reverse());
                sb.append(' ');
                word.setLength(0);
            }
            i++;
        }
        sb.append(word.reverse()); //final word after the loop remains in the word after twhile loop finishes processing, and so you add it manually to the sb string that contains all the words up until the last word before a space
        return sb.toString();
    }
}