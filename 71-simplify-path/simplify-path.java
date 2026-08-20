class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk= new Stack<>();
        String []comps= path.split("/");

        for(String c: comps){
            if(c.equals("") || c.equals(".")) continue;
            if(c.equals("..")){
                if(!stk.isEmpty()) stk.pop();
            } else{
                stk.push(c);
            }
        }

        if(stk.isEmpty()){
            return "/";
        }

        StringBuilder res=new StringBuilder();
        for(String dir: stk){
            res.append("/").append(dir);
        }

        return res.toString();
        
    }
}