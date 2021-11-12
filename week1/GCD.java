package com.po.week1;

public class GCD {

    public static void findGCD(int arr[]) {
        int result = arr[0];

        for(int i = 0; i < arr.length; i++) {
            result = findGCDBetweenTwoNums(arr[i], result);
        }
        System.out.println(result);
    }

    public static int findGCDBetweenTwoNums(int a, int b) {
        if(b == 0) {
            return a;
        }
        return findGCDBetweenTwoNums(b, a%b);
    }

    public static void main(String[] args) {
        int test1[]= {84, 70, 42, 56};
        int test2[]= {19, 38, 76, 133};
        int test3[]= {120, 300, 95, 425, 625};

        System.out.println("The GCD of test 1 is: ");
        findGCD(test1);

        System.out.println("The GCD of test 2 is: ");
        findGCD(test2);

        System.out.println("The GCD of test 3 is: ");
        findGCD(test3);


    }
}
