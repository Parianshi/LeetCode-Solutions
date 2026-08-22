class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int temp=n;
        while(temp>0){
            int val=temp%10;
            sum += val;
            prod *= val;
            temp=temp/10;
        }

        return n%(sum+prod)==0;
    }
}