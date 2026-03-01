class Solution {
    public String minWindow(String s, String t) {
        int ns = s.length();
        int nt = t.length();
        if(ns<nt) return "";
        int minlen = Integer.MAX_VALUE;
        int sIndex = -1;
        int cut = 0;
        int[] hash = new int[256];
        Arrays.fill(hash, 0);
        for(int i = 0; i<nt; i++){
            hash[t.charAt(i)]++;
        }
        int r = 0;
        int l = 0;
        while(r<ns){
           if(hash[s.charAt(r)] > 0) cut++;
           hash[s.charAt(r)]--;
           while(cut == nt){
            if(r-l+1 < minlen){
                minlen = r-l+1;
                sIndex = l;
            }
            hash[s.charAt(l)]++;
            if(hash[s.charAt(l)] > 0) cut--;
            l++;
           }
           r++;
        }
        if(sIndex == -1) return "";
        return s.substring(sIndex, sIndex + minlen);
    }
}