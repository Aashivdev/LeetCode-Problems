class Solution {
    public int numSquares(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        return dfs(n,map);
    }
    public int dfs(int target,HashMap map){
        if(target==0){
            return 0;
        }
        if(map.containsKey(target)){
            int x= (int)map.get(target);
            return x;
            }
        int res=target;
        for(int i=1;i*i<=target;i++){
            res=Math.min(res,1+dfs(target-i*i,map));
        }
        map.put(target,res);
        return res;
        }
    
}