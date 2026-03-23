class Solution {
    public String reverseWords(String s) {
        char[] st=s.toCharArray();
        int n=st.length;
        int start=0;
        for(int end=0;end<=n;end++)
        {
            if(end==n||st[end]==' ')
            {
                int left=start;
                int right=end-1;
                while(left<right)
                {
                    char temp=st[left];
                    st[left]=st[right];
                    st[right]=temp;
                    left++;
                    right--;
                }
                start=end+1;
            }
           
        }
        return new String(st);

        
    }
}
//our own code
