package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CoinChangeWays {
    static List<List<Integer>> ways = new ArrayList<>();

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100};
        int amount = 10;//15353
        count(coins, 0, amount, new ArrayList<>(), coins.length);
        System.out.println(ways);
    }

    private static void count(int[] coins, int index, int remainder, List<Integer> way, int length) {
        if (remainder == 0) {
            ways.add(new ArrayList<>(way));
            return;
        }

        if (index == length || remainder < 0) return;
        way.add(coins[index]);
        count(coins, index, remainder - coins[index], way, length);
        way.remove(way.size() - 1);
        count(coins, index + 1, remainder, way, length);

    }
}
