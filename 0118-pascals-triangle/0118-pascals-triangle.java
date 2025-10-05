import java.math.BigInteger;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outside = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> inside = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                BigInteger a = fact(i).divide(fact(j).multiply(fact(i - j)));
                inside.add(a.intValue()); // safe because Pascal’s Triangle values fit in int
            }
            outside.add(inside);
        }
        return outside;
    }

    static BigInteger fact(int n) {
        if (n <= 1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(fact(n - 1));
    }
}