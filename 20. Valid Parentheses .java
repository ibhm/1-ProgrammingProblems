class Solution {
    
        static Map<Character, Character> mapping = new HashMap<Character, Character>(){{ //hashmap is static because it should be created without creation of the object 
            put(')','(');
            put('}','{');
            put(']','[');
        }};
    
    //the only accepted sequences include having an open bracket before a close bracket. )( is not accepted.ALSO NOT ACCEPTED IS {[}]. Hence the top element in the stack must correspond to the closing bracket being investigated. open brackets MUST BE closed in the correct order. so you encounter a open bracket, u must encounter a closed bracket after it of the SAME TYPE for this to be a valid input
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack(); //initlaize new stack of characters
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i); //analyse first character
            char topElement = 'b'; //assign randomly a character to initalize this value
            if(mapping.containsKey(c)){ //it will check to see if the character is a closed braacket and then do below. essentially only closed brackets are checked, all open brackets are pushed.
                //if stack is empty, push this value into stack as there is nothing there
                if(stack.isEmpty()==true){
                    stack.push(c);
                }
                //if stack isnt empty, pop out the top value
                else if(stack.isEmpty() == false){ 
                    topElement = stack.pop();
                    //if its not equal to the value of the key, then it will return false and instead decide to move on 
                    if(topElement!=mapping.get(c)){
                        return false; //whole sequence stops and false is return so it moves to next element;
                    }
                }
                }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}