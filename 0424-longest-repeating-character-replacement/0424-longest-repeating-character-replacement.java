class Solution {
    public int characterReplacement(String s, int k) {
       int maxlen = 0;
       int[] hash = new int[26];
       Arrays.fill(hash, 0);
       int l = 0;
       int r = 0;
       int mmf = 0;
       while(r<s.length()){
          hash[s.charAt(r) - 'A']++;
          mmf = Math.max(mmf, hash[s.charAt(r) - 'A']);
          while((r-l+1) - mmf > k){
            hash[s.charAt(l) - 'A']--;
            l++;
            mmf = 0;
            for(int i = 0; i<26; i++){
              mmf = Math.max(mmf, hash[i]);
            } 
          }
          if((r-l+1) - mmf <= k)
          {
            maxlen = Math.max(maxlen, (r-l+1));
          }
          r++;
       }
        return maxlen;
    }
}