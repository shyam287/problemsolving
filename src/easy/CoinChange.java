package easy;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {

    Map<Integer, Integer> map = new HashMap<>();

    public int coinChange(int[] coins, int amount) {

        if (map.get(amount) != null) {
            return map.get(amount);
        }

        if (amount == 0) {
            return 0;
        }

        if(amount < 0) {
            return -1;

        }

        int result = -1;

        for(int i=0; i< coins.length; i++) {

            int countOfCoin = 0;

            if(amount >= coins[i] ) {
                int coin = coinChange(coins, amount - coins[i]);
                countOfCoin = coin >= 0 ?  countOfCoin + 1 + coin :  -1;
            }

            if (result == -1 && countOfCoin>0) {
                result = countOfCoin;
            }

            if(countOfCoin > 0 ) {
                result = Math.min(result, countOfCoin);
            }
        }

        map.put(amount, result);

        return map.get(amount) == null ? -1 : map.get(amount);
    }
}
