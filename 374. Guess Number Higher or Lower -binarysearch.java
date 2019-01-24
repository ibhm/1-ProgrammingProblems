/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i = 1;
        int j = n;
        while ( j >= i){
            
            int mid = i + (j - i) / 2;  //binary search for element
            
            int guess1 = guess(mid);   //inital guess  of middle element
             
            if(guess1==0){  //if guess is correct, return middle element
                return mid;
            }
            else if(guess1==-1){ //if actual # is lower, search in lower half
                j = (mid-1);  
            }
            else{  //search in higher half
                i = (mid+1);
            }
        } //end of binary search
        return -1;
    }
}