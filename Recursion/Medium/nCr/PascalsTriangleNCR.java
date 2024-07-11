class PascalsTriangleNCR{
    static int nCr(int n, int r)
    {
        // Using Pascals Triangle
        
        int[] comb = new int[r+1];
        comb[0] = 1;
        
        for(int i = 1;i<=n;i++) {
            for(int j=Math.min(i,r);j>0;j--){
                comb[j] = (comb[j]+comb[j-1])%(int)(1e9+7);
            }
        }
        return comb[r]%(int)(1e9+7);
    }
}
