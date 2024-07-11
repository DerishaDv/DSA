class GrayCode {
    
    public List<Integer> grayCode(int n) {
        List<Integer> grays = new ArrayList<>();
        findGray(grays, (1<<n)-1);  
        return grays;     
    }

    private void findGray(List<Integer> grays, int n) {
        if(n<0) return;
        findGray(grays, n-1);
        grays.add(n^(n>>1));
    }
}
