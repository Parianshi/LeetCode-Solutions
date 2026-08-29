class Solution {
public:
    string mergeAlternately(string word1, string word2) {
       string r="";
       int i=0;
       while(i< word1.size() || i<word2.size()){
        if(i<word1.size()) r+= word1[i];
        if(i<word2.size()) r+= word2[i];
        i++;
       }
       return r;
        
    }
};