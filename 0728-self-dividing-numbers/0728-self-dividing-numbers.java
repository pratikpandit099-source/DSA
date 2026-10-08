class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res =new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(check(i)){
                res.add(i);
            }

        }

        return res;
    }
    static boolean check(int n){
        int m =n;
        while(n>0){
            int k =n%10;
            if(k==0){
                return false;
            }
            if(m%k!=0){
                return false;
            }else{
                n=n/10;
            }
        }
        return true;

    }
}