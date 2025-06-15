class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> o = new ArrayList<>();
        o.add(new ArrayList<>());
        for(int num : nums)
        {
            int n = o.size();
            for(int i = 0; i < n; i++)
            {
                List<Integer> in = new ArrayList<>(o.get(i));
                in.add(num);
                o.add(in);
            }
        }
        return o;
    }
}