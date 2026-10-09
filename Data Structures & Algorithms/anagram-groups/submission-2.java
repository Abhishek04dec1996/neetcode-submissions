class Solution {

    public boolean isanagram(String a , String s2){

            if(a.length() !=s2.length()){
             return false ;   
            }
            
            int[] s =new int[26];

            for(int i = 0 ; i < a.length() ;i++){
             s[a.charAt(i)-'a']++;
             s[s2.charAt(i)-'a']--;
             }
            for(int i : s){
             if( i !=0){
                return false;
             }
            }
        
        return true;


    }

    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,
                List<String>> map =
                new HashMap<>();

        for(String str : strs) {

            // Convert string to char array
            char[] chars =
                str.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Create key
            String key =
                new String(chars);

            // Add to hashmap
            map.putIfAbsent(key,
                            new ArrayList<>());

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());



    }
}
