# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    ##goal is to find the height of each subtree, find the height of left and right subtree properly in a helper function at the very top. finds the max depth of left and right subtree at root. the max value of each of these depths is all we need
    def maxdepth(self,root):
        if(root==None):
            return 0
        else:
            left = self.maxdepth(root.left) 
            right = self.maxdepth(root.right) 
        return max(left,right)+1
    
    def isBalanced(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """

        if(root==None):
            return True
        ##if difference between left and right is less than 2, then it is acceptable
        if(abs(self.maxdepth(root.left)-self.maxdepth(root.right))>1):
            return False
        ##ensures that there is a left subtree and a right subtree that is balanced as it recursively checks left and right subtrees
        return self.isBalanced(root.left) and self.isBalanced(root.right)
    
            