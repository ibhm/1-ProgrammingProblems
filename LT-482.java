class Solution {

    public String licenseKeyFormatting(String S, int K) {
        
        StringBuilder sb = new StringBuilder();
        S = S.replace("-", "");
        int count = 0;
        
        for (int i = S.length()-1; i>=0; i--){
        
            if(count == K){
                sb.append("-");
                count = 0;
            }
        
            sb.append(S.charAt(i));
            count++;
        }
        
        sb.reverse();
        
        return sb.toString().toUpperCase();
    }
}