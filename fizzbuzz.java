class Solution {

    //returns the words fizz at multiples of 3, buzz at  multiples of 5, and multiples  at 3 and 5
    public List<String> fizzBuzz(int n) {
        
        List<String> array = new ArrayList<>();
        
        for(int i = 1; i <= n ;i++){
            if(i%5 == 0 && i%3 ==0 ){
                array.add("FizzBuzz");
            }
            else if(i%3 == 0 ){
                array.add("Fizz");
            }
            else if (i%5 == 0 ){
                array.add("Buzz");
            }
            else{
                array.add(Integer.toString(i));}
        }
        return array;
    }

}
