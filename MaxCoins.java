import java.util.Arrays;

public class MaxCoins {
    public static int maximumCoins(int[] piles){
        Arrays.sort(piles);
        int i = 0;
        int j = piles.length-2;
        int k = piles.length-1;
        int counter = 0;
        while (i < j){
            counter += piles[j];
            i++;
            j = j-2;
            k = k-2;
        }
        return counter;
    }
    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,1,2,3,4};
        System.out.println(maximumCoins(nums));
    }
}
