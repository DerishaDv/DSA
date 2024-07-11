class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> gray = new ArrayList<>();
        for(int i = 0;i< (1<<n);i++){
            gray.add((i>>1)^i);
        }
        return gray;
        
    }
}
