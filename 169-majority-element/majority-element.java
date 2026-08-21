class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp= new HashMap<>();

        for(int num: nums){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }

        int ans=0, maxFreq=0;
        for(int num: nums){
            int freq= mp.get(num);
            if(freq> maxFreq){
                maxFreq=freq;
                ans=num;
            }
        }

        return ans;
        
    }
}