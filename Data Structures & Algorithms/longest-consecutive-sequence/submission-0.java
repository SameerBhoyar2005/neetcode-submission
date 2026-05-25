class Solution {
    public int longestConsecutive(int[] arr) {
        int longest= 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
          set.add(arr[i]);
        }
        int i = 0;
       while(i<arr.length){
          if(set.contains(arr[i] - 1)){
            i = i+1;
            continue;
          }
        int currentCount = 1;
        int element = arr[i];
        while(set.contains(element + 1)){
            currentCount = currentCount + 1;
            element = element + 1;
            }
            longest = Math.max(longest,currentCount);
            i++;
        }
        return longest;
    }
}
