class Solution {
    class Pair{
        int key;
        int freq;
        Pair(int ke,int f){
            key = ke;
            freq = f;
        }
    }
    public int[] topKFrequent(int[] arr, int k) {
        int result[]= new int[k];
        Arrays.sort(arr);
        int n = arr.length;
        int p = 0;
        int j = 0;
       List<Pair> arr1 = new ArrayList<>();// Pair arr1[] = new Pair[n];
        while(p < n){
            int count = 1;
            while(p + 1 < n && arr[p] == arr[p+1]){
                count = count + 1;
                p = p+1;
            }
           // arr1[j] = new Pair(arr[p],count);
           arr1.add(j, new Pair(arr[p], count));
            j = j+1;
            p = p+1;
        }
        //Arrays.sort(arr1,(a,b) -> b.freq - a.freq);
        arr1.sort((a,b)-> b.freq - a.freq);

        for(int i = 0; i < k;i++){
            //result[i] = arr1[i].key;
            result[i] = arr1.get(i).key;
        }

        return result;
    }
}
