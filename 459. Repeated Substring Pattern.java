class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str = s+s;  
        return str.substring(1,str.length()-1).contains(s);   
    }
    //substring(inclusive start position, exclusive stop position)
    //ab = false condition
    //ab+ab= abab, and produces ba, ba !=ab, hence false
    //abab = true condtion
    //abab+abab= abababab and produces b(abab)a, which contains abab hence true result
}