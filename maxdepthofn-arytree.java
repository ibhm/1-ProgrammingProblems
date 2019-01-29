/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import java.io.*; 
import java.util.*; 

class Solution {
    public int maxDepth(Node root) {
        int count = 0;
        if(root==null){
            return 0;
        }
        //if children of root are not present then return 1;
        else if(root.children.size()==0){
            return count=1;
        }
        //create a new array, for each child in tree, recurisvely run depth function
        else{
            List<Integer> max1 = new ArrayList<>();
            for(Node item:root.children)
            {
                max1.add(maxDepth(item));
            }
            //built-in finder of max value
            return Collections.max(max1)+1;
        }
     }
}

