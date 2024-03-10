class Solution {
   
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> a = new ArrayList<>();
        a.add(Arrays.asList(1));
        
        for(int i = 1; i < numRows; i++){
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for(int j = 1; j < i; j++){
                List<Integer> prevList = a.get(i-1);
                tmp.add(prevList.get(j-1)+prevList.get(j));
                
            }
            tmp.add(1);
            a.add(tmp);
        }
        return a; 
    }
                      
}