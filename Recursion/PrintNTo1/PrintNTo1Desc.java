package Recursion;

import java.util.ArrayList;
import java.util.List;


public class PrintNTo1Desc {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int n = 50;
        print(n);
        System.out.println(list);
    }
    private static void print(int n){
        // Add the base condition
        if(n==0) return;
        list.add(n);
        print(n-1);
    }
}
