package com.erikriosetiawan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    // Complete the bonAppetit function below
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i == k)
                continue;
            total += bill.get(i);
        }

        int billSplit = total / 2;

        int refund = b - billSplit;

        if (refund == 0)
            System.out.print("Bon Appetit");
        else
            System.out.print(refund);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] billItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> bill = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int billItem = Integer.parseInt(billItems[i]);
            bill.add(billItem);
        }

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}