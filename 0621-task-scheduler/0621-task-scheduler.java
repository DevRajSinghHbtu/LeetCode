class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> mp = new HashMap<>();
        
        for (char t : tasks) {
            mp.put(t, mp.getOrDefault(t, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int freq : mp.values()) {
            pq.add(freq);
        }

        int time = 0;

        while (!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int cycle = n + 1;

            while (cycle > 0 && !pq.isEmpty()) {
                int curr = pq.poll();
                if (curr - 1 > 0) {
                    temp.add(curr - 1);
                }
                time++;
                cycle--;
            }
            for (int val : temp) {
                pq.add(val);
            }
            if (!pq.isEmpty()) {
                time += cycle;
            }
        }

        return time;
    }
}