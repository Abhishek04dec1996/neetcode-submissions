class Solution {
    public boolean isPalindrome(String s) {
      
        s=s.replaceAll("\\s","");
        s=s.replaceAll("[^a-zA-Z0-9]", "");

        for(int i = 0 ; i < s.length()/2 ; i ++){
            System.out.println(s.charAt(i) +" ==  " +s.charAt( s.length()-i-1));
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(s.length()-i-1))){
                return false;
            }
            
        }


        return  true;  
    }
}
