class NCR{
    static int nCr(int n, int r)
    {
        // code here
        if(n<r) return 0;
        if(r==0) return 1;
        if(r==1)return n;
        if(n==1) return 1;
        
        return (nCr(n-1, r-1))+nCr(n-1, r);
    }
}
