class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
		# Adding the arrays together
        lst = nums1+nums2
		# Sorting the list
        sortedLst = sorted(lst)  
		# Since, median means the middle-most value
		# If the length of list is odd, then the median will be the middle-most value
		# else if the length of list is even, then the median will be sum of two middle values/2
		# That is the reason we considering the value at index((length of the lst)-1)/2 i.e, the middle index value
        index = (len(lst) - 1) // 2
        if (len(lst) % 2):
            return lst[index]
        else:
            return (lst[index] + lst[index + 1])/2.0
