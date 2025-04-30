class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String rp=word;
        while(sequence.contains(rp))
        {
            count++;
            rp = rp+word;
        }
        return count;
    }
}