package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Print1ToN {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int n = 50;
        print(n);
        System.out.println(list);
    }
    static void print(int n){
        if(n==0) return;
        print(n-1);
        list.add(n);
    }
}
