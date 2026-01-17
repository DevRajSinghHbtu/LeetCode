class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findSum(0, candidates, target, ans, ds);
        return ans;
    }
    public void findSum(int i, int[] ar, int target, List<List<Integer>> ans, List<Integer> ds)
    {
        if(i == ar.length)
        {
            if(target == 0)
            {
                if(!ans.contains(ds))
                ans.add(new ArrayList<>(ds));

            }
            return;
        }
        if(ar[i] <= target)
        {
            ds.add(ar[i]);
            findSum(i+1, ar, target - ar[i], ans, ds);
            ds.remove(ds.size()-1);
        }
        while(i+1<ar.length && ar[i]==ar[i+1]) i++;
        findSum(i+1, ar, target , ans, ds);
    }
}