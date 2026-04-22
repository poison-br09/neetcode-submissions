class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c)) return false;  
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c); 
            }
        }
        
        return map.isEmpty();
    }
}
