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
        
    List<List<String>> ans = new ArrayList<>();


    for(String ST:strs){
        boolean isadded=false;
        for(int i = 0 ; i<ans.size();i++){
            if(isanagram(ans.get(i).get(0),ST)){
                ans.get(i).add(ST);
                isadded = true;
                i=ans.size();
            }

        }
        if(!isadded){
            List<String> ad=  new ArrayList<>();
            ad.add(ST);
            ans.add(ad);
        }


    } 

    return ans; 


    }
}
