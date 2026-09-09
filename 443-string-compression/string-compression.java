class Solution {
    public int compress(char[] chars) {
        int idx=0;
        int n=chars.length;
        for(int i=0;i<n;i++){
            char ch= chars[i];
            int count=0;
            while(i<n && chars[i]==ch){
                i++;
                count++;
            }

            if(count==1){
                chars[idx++]=ch;
            } else {
                chars[idx++]=ch;
                for(char c: String.valueOf(count).toCharArray()){
                    chars[idx++]=c;
                }
            }
            i--;
        }
        return idx;
    }
}