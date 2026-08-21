class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans= new ArrayList<>();
        HashMap<String,Integer> mp= new HashMap<>();

        for(String str: strs){
            char [] chars= str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(mp.containsKey(sorted)){
                ans.get(mp.get(sorted)).add(str);
            } else{
                mp.put(sorted, ans.size());
                ans.add(new ArrayList<>(Arrays.asList(str)));
            }
        }
        return ans;
        
    }
}