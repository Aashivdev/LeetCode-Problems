class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         HashMap<Integer,Integer>map = new HashMap<>();
         HashSet<Integer>set=new HashSet<>();
         for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
         }
         int count=0;
         for(int x : map.keySet()){
           
                if(set.contains(map.get(x))){
                    return false;
                }
                else{
                    set.add(map.get(x));
                }
            
         }
         return true;
       

    }
}