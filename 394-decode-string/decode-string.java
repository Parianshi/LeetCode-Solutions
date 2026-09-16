class Solution {
    public String decodeString(String s) {
        int k=0;
        String curr="";
        Stack<Integer> num= new Stack<>();
        Stack<String> str=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(Character.isDigit(ch)){
                k=k*10 + (ch-'0');
            } 
            else if(ch=='['){
                num.push(k);
                str.push(curr);
                k=0;
                curr="";
            } 
            else if(Character.isLetter(ch)){
                curr += ch;
            }
            else if(ch==']'){
                int rpt= num.pop();
                String prev=str.pop();
                String temp="";

                for(int j=0;j<rpt;j++){
                    temp += curr;
                }
                curr = prev+temp;
            }
        }
        return curr;
    }
}