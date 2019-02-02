
class Solution:
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if(root==None):
            return 0
        else:
            right = self.maxDepth(root.right)+1
            left = self.maxDepth(root.left)+1
        if(right>left):
            return right
        return left
        