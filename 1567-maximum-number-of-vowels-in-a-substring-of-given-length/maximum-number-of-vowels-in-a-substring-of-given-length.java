class Solution {

    private boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
    public int maxVowels(String s, int k) {
        int count=0;
        int maxCount=0;
        for(int i=0;i<k;i++){
            char ch= s.charAt(i);
            if(isVowel(ch)) count++;
        }
        int maxi=count;

        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))) count--;
            if(isVowel(s.charAt(i))) count++;
            maxi=Math.max(maxi,count);
        }
        return maxi;

       
    }
}