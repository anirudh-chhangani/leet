package io.anirudhchhangani;

class LongestSubstringWithoutDuplicates {

    public int lengthOfLongestSubstring(String s) {
        var last = new java.util.HashMap<Character, Integer>();
        int max = 0,
            left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (last.getOrDefault(c, -1) >= left) {
                left = last.get(c) + 1;
            }
            last.put(c, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
