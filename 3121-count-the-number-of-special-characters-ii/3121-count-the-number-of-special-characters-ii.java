class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> lower = new HashMap<>();
        HashMap<Character,Integer> upper = new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                lower.put(ch,i);
            }
            else{
                upper.putIfAbsent(ch,i);
            }
        }
        int count=0;
        for(char ch: lower.keySet()){
            char capital = Character.toUpperCase(ch);
            if(upper.containsKey(capital) && lower.get(ch)<upper.get(capital)){
                count++;
            }
        }
        return count;
    }
}