class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.equals(t)){
            return true;
        }
        String[] char1= s.split("");
        String[] char2=t.split("");
        HashMap<String,Integer> map= new HashMap<>();
        for(String a:char1){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else {
                map.put(a,1);
            }
        }
        for(String a:char2){
            if(map.containsKey(a)){
                map.put(a,map.get(a)-1);
            }else {
               return false ;
            }
        }

       return map.values()
        .stream()
        .allMatch(value -> value == 0);
 
    }
}
