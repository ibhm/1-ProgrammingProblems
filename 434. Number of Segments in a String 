 class Solution {
    public int countSegments(String s) {
        int count = 0;  //initalize 
        char[] chars = s.toCharArray(); //convert string to a character array for comparision
        for (int i = 0; i < chars.length; i++){
            if(chars[i]!= ' '){ //if a character is not a space, it is the begining of a segment
                count++;
            }
            while(i<chars.length && chars[i]!=' '){ //HERE, if the next charcter is not a space, INCREMENT TILL U GET TO ANOTHER SPACE character. aka i keeps on increasing until you go to a character that is a space marking the end of that segment
                i++;
            }
        }
        return count;
    }
 } 