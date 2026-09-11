class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n= arr.length;
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int x: arr) mp.put(x, mp.getOrDefault(x,0)+1);
        HashSet<Integer> set= new HashSet<>();
        for(int value: mp.values()){
            if(set.contains(value)) return false;
            set.add(value);
            
        }
        return true;
    }
}