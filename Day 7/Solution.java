// https://leetcode.com/problems/word-pattern/

class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> map = new HashMap<>();
        String[] words = str.split(" ");
        
        if(pattern.length() != words.length)
            return false;
        
        for(int i=0; i<pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)) {
                if( !map.get(ch).equals(words[i]))
                    return false;
            }
            else {
                if(map.containsValue(words[i]))
                    return false;
                map.put(ch,words[i]);
            }
        }
        return true;
    }
}
