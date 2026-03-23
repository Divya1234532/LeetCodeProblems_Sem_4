class Solution {
    public int maximumWealth(int[][] accounts) {
        /*int max=0;
        for(int r=0;r<accounts.length;r++)
        {
            int sum=0;
            for(int c=0;c<accounts[r].length;c++)
            {
                 sum+=accounts[r][c];
            }
            if(max<sum)
            {
                max=sum;
            }
        }
        return max;*/
        int rich = 0;
        for (int[] i : accounts) {
            int sum = 0;
            for (int money : i) {
                sum += money;
            }
            rich = Math.max(rich, sum);
        }
        return rich;
    }
}  
  
//ours own code
