class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> mp= new HashMap<>();
        int n=s.length();
        int l=0;
        int r=0;
        int ans=Integer.MIN_VALUE;
        for(r=0;r<n;r++){
            char ch= s.charAt(r);
            mp.put(ch, mp.getOrDefault(ch,0)+1);
            while(mp.get(ch)>2){
                char remove= s.charAt(l);
                mp.put( remove, mp.getOrDefault(remove,0)-1);
                l++;
            }
            ans=Math.max(ans, r-l+1);
        }
        return ans;
    }
}