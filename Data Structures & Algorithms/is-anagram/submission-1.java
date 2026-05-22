class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char p: t.toCharArray()){
            if(!map.containsKey(p)|| map.get(p) == 0){
                return false;
            }
            map.put(p,map.getOrDefault(p,0)-1);
        }
        return true;
    }
}
