class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0] != 5) return false;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0;i<bills.length; i++){
            if(bills[i] == 5){
                mp.put(bills[i], mp.getOrDefault(bills[i], 0)+1);
            }
            else if(bills[i] == 10)
            {
                if(mp.get(5) == 0) return false;
                mp.put(5, mp.get(5)-1);
                mp.put(10, mp.getOrDefault(10, 0) +1);
            }
            else{
                int five = mp.getOrDefault(5, 0);
                int ten = mp.getOrDefault(10, 0);
                if(ten >= 1 && five >= 1){
                    mp.put(10, ten - 1);
                    mp.put(5, five - 1);
                }
                else if(five>=3){
                    mp.put(5, five - 3);
                }
                else return false;
            }
        }
        return true;
    }
}