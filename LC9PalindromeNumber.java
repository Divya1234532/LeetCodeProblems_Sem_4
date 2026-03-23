class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        char[] st=s.toCharArray();
        int left=0;
        int right=st.length-1;
        while(left<right)
        {
            if(st[left]!=st[right])
            {
                return false;
            }
            left++;
            right--;
        }
        return true;  
    } 
}
//our own code
