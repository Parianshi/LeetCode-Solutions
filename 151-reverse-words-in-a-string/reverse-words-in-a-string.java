class Solution {
    public String reverseWords(String s) {
        String []word = s.trim().split("\\s+");
        int n=word.length;
        String ans="";
        for(int i=n-1;i>0;i--){
            ans+=word[i]+" ";
        }
        return ans+word[0];
    }
}