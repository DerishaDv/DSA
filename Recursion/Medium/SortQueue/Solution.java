class Solution {
    public int[] sortArray(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        int n = nums.length;
        for (int x : nums) {
            queue.add(x);
        }
        sortQueue(queue);
        for(int i = 0;i<n;i++){
            nums[i]=queue.poll();
        }
        return nums;

    }

    private void sortQueue(Queue<Integer> queue) {
        if(queue.isEmpty()) return;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < queue.size(); i++) {
            int current = queue.poll();
            max = Math.max(max, current);
            queue.add(current);
        }

        for (int i = 0; i < queue.size(); i++) {
            int current = queue.poll();
            if(current!=max)
            queue.add(current);
        }
        sortQueue(queue);
        queue.add(max);
    }
