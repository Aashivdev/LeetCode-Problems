class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
        while(n>0){
            int x=n%10;
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);

            }
            n=n/10;
        }
        int min=Integer.MAX_VALUE;
        int value=0;
        for(int x : map.keySet()){
           if(map.get(x)<min){
            min=map.get(x);
            value=x;
           }
        }
        return value;
    }
}