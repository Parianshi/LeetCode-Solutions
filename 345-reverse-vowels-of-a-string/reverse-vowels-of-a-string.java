class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        int start=0;
        int end= n-1;
        String vowels= "aeiouAEIOU";
        char [] word= s.toCharArray();

        while(start<end){
            while(start<end && vowels.indexOf(word[start])==-1){
                start++;
            }

            while(start<end && vowels.indexOf(word[end])==-1){
                end--;
            }

            char temp= word[start];
            word[start]=word[end];
            word[end]=temp;

            start++;
            end--;
        }

        return new String(word);
        
    }
}