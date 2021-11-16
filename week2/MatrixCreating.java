package com.po.week2;




public class MatrixCreating {
    public static void matrixPrinting(int n){
        if(n == 0){
            System.out.println("[]");
        }

        for(int i =0; i<n; i++){
            System.out.print("[");
            for(int j = 0; j<n; j++){
                if(j != n -1){
                    System.out.print(n + ", ");
                }else{
                    System.out.print(n + "]");
                }
            }
            if(i != n-1){
                System.out.print(",\n");
            }

        }
    }
    public static void main(String[] args) {
        matrixPrinting(5);
        System.out.println("\n");
        matrixPrinting(3);
        System.out.println("\n");
        matrixPrinting(1);
        System.out.println("\n");
        matrixPrinting(0);
    }
}
