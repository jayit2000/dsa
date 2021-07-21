class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        if (numRows == 0):
            return [[]]
        
        ans=[]
        ans.append([1])
        for i in range(1,numRows):
            row=[]
            prev_row=ans[i-1]
            row.append(1)
            for j in range(1,i):
                row.append(prev_row[j-1]+prev_row[j])
            row.append(1)
            ans.append(row)
        return ans
        
