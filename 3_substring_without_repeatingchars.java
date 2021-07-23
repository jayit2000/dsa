class Solution {
public int lengthOfLongestSubstring(String s) {
if(s.length()==0)
return 0;
int start=0,result=1;
HashSet set = new HashSet<>();
for(int i=0;i<s.length();i++ )
{
char temp = s.charAt(i);
while(set.contains(temp))
set.remove(s.charAt(start++));
set.add(temp);

        result = Math.max(result,i-start+1);
    }
    return result;
    
}
}
