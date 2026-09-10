class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        mp.put(0,1);
        int sum=0;
        int n= nums.length;
        int count=0;
        for(int num: nums){
            sum += num;
            int rem= (sum%k + k)%k;
            // if(rem<0) rem=k;
            if(mp.containsKey(rem)) count +=  mp.get(rem);
            mp.put(rem, mp.getOrDefault(rem,0)+1);
        }
        return count;
    }
}