class TowerOfHanoi {

    public long toh(int n, int from, int to, int aux) {
        // Your code here
       return towerOfHanoi (n, from, aux, to);
        
    }
    
    private long towerOfHanoi(int n, int from, int aux, int to){
        long count = 0L;
        if(n!=0){
            count += towerOfHanoi(n-1, from, to, aux);
            System.out.println("move disk "+n+" from rod "+from+" to rod "+ to);
            count++;
            count += towerOfHanoi(n-1, aux, from, to);
        }
        return count;
            
    }
}
//https://www.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1
