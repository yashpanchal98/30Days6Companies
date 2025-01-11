class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        HashSet<String> hs1 = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>();
        
        for(int i=0; i<s.length()-9; i++){

            String subString = s.substring(i,i+10);
            if(hs1.contains(subString)){
                hs2.add(subString);
            } else {
                hs1.add(subString);
            }
        }
        return new ArrayList<>(hs2);
    }
}
