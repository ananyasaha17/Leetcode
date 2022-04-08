class KthLargest {
        PriorityQueue<Integer> pq;
        int k;
        public KthLargest(int k, int[] nums) {
       
            this.k = k;

            pq = new PriorityQueue<>(k+1);
            for (int i = 0; i < nums.length; i++) {
                pq.add(nums[i]);
                if (pq.size() > k)
                    pq.poll();
            }
        }

        public int add(int val) {
            pq.add(val);

            if (pq.size() > k)
                pq.poll();

            return pq.peek();
        }
}
