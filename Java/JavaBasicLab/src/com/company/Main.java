package com.company;
import java.util.*;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        sumsByTown();

    }

    public static boolean isSymetrical(int num) {
        char[] str = Integer.toString(num).toCharArray();
        for (int i = 0; i < str.length / 2; i++) {
            if (str[i] != str[str.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void expression() {
        double expression = Math.pow(((30 + 21) * 0.5 * (35 - 12 - 0.5)),2);
        System.out.println(expression);
    }

    public static void sumTwoNumbers() {
        double num1 = Double.parseDouble(input.nextLine());
        double num2 = Double.parseDouble(input.nextLine());
        System.out.println(num1 + num2);
    }

    public static void sum3Integers() {
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 + num2 == num3) {
            System.out.printf("%d + %d = %d", Math.min(num1, num2), Math.max(num1, num2), num3);
        }
        else if (num2 + num3 == num1) {
            System.out.printf("%d + %d = %d", Math.min(num3, num2), Math.max(num3, num2), num1);
        }
        else if (num1 + num3 == num2) {
            System.out.printf("%d + %d = %d", Math.min(num1, num3), Math.max(num1, num3), num2);
        }
        else
            System.out.printf("No");
    }

    public static void sumNIntegers() {
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            sum += num;
        }
        System.out.printf("Sum = %d", sum);
    }

    public static void symmetricNumbers() {
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (isSymetrical(i))
                System.out.printf("%d ", i);
        }
    }

    public static void largest3Numbers() {
        int nums[] = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= nums.length - 3 && i >= 0; i--) {
            System.out.printf("%d ", nums[i]);
        }

    }

    public static void sumsByTown() {
        Map<String, Double> towns = new TreeMap<>();
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            String text = input.nextLine();
            String[] elements = text.split("\\|");
            String town = elements[0].trim();
            double income = Double.parseDouble(elements[1].trim());
            if (!towns.containsKey(town)) {
                towns.put(town, income);
            }
            else {
                towns.put(town, towns.get(town) + income);
            }
        }

        for (String town : towns.keySet()) {
            System.out.println(town + " -> " + towns.get(town));
        }

    }
}
