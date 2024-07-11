class PredictTheWinner {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int total =0;
        for(int x : nums) total+=x;
        int p1 =play(nums, 0, n-1);
        return p1>=total-p1;
    }

    private int play(int[] nums, int start, int end) {
        if(start>end) return 0;
        if(start==end) return nums[start];
        int takeStart = nums[start] + Math.min(play(nums, start+1, end-1), play(nums,start+2, end));
        int takeEnd = nums[end] + Math.min(play(nums, start, end-2), play(nums, start +1, end-1));
        return Math.max(takeStart, takeEnd);
    }
}
