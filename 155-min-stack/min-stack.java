class MinStack {
    private List<int[]> s;
    public MinStack() {
       s=new ArrayList<>(); 
    }
    
    public void push(int val) {
        int[] top =s.isEmpty() ? new int[]{val, val} : s.get(s.size() -1);
        int min_value = top[1];
        if (min_value > val)
        {
            min_value = val;
        }
        s.add(new int[]{val, min_value});
    }
    
    public void pop() {
        s.remove(s.size() -1);
    }
    
    public int top() {
        return s.isEmpty() ? -1 : s.get(s.size() -1)[0];
    }
    
    public int getMin() {
        return s.isEmpty() ? -1 : s.get(s.size() -1)[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */