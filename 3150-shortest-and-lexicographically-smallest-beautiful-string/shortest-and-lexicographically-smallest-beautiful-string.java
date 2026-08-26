class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans="";
        int count=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            char ch= s.charAt(r);
            if(ch=='1') count++;

            while(count>k){
                if(s.charAt(l)=='1') count--;
                l++;
            }

            if(count==k){
                while(l<r && s.charAt(l)=='0') l++;
                String curr = s.substring(l,r+1);

                if(ans.isEmpty() || 
                curr.length() < ans.length() || 
                curr.length()==ans.length() && curr.compareTo(ans) < 0){
                    ans=curr;
                }
            }

            
        }
        return ans.toString();
    }
}