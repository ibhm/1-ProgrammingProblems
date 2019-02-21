//lisence key formatting

class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        S = S.replace("-", "");
       	//removes any - in the orignal string

       	//work backwards from the end of the string
        int count = 0;
        for (int i = S.length()-1; i>=0; i--){
        	//after going back K times, add "-" character
            if(count == K){
                sb.append("-");
                count = 0;
                //restart count
            }
            //add character from original string into new string 
            sb.append(S.charAt(i));
            count++;
        }

        //reverse the new string
        sb.reverse();
        //return uppercase format of string
        return sb.toString().toUpperCase();
    }
}
