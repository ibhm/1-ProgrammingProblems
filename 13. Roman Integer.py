class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        roman = {'M':1000, 'D':500, 'C':100, 'L':50, 'X':10, 'V':5,'I':1}
        
        x = 0
        
        for i in range(0,len(s)-1):
            if (roman[s[i]] >= roman[s[i+1]]):
                x = x + roman[s[i]]
            else: 
                x = x - roman[s[i]]
                
        x = x + roman[s[len(s)-1]]
        return x