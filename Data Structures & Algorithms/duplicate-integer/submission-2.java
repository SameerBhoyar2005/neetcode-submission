class Solution {
    public boolean hasDuplicate(int[] arr) {
        int n = arr.length;
        Set<Integer> s = new HashSet<>();

        for(int i:arr){
            if(s.contains(i)){
                return true;
            }
            s.add(i);
        }
        return false;
    }
}