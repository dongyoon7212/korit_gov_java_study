package _13_MultiArray;

import java.util.Arrays;

public class MultiArrayLoop {
    public static void main(String[] args) {
        //다차원 배열 순회
        String[][] seats = new String[][]
                {
                        {"A1", "A2", "A3", "A4", "A5"},
                        {"B1", "B2", "B3", "B4", "B5"},
                        {"C1", "C2", "C3", "C4", "C5"}
                };

        for (int i = 0; i < 3; i++) { //행
            for (int j = 0; j < 5; j++) { //열
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

        //아이맥스 영화관
        //세로 10칸 가로 15칸
        String[][] imaxSeats = new String[10][15];
//        String[] eng = {"A", "B", "C", "D" ,"E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < imaxSeats.length; i++) {
            String eng = String.valueOf((char) ('A' + i));
            for (int j = 0; j < imaxSeats[i].length; j++) {
                imaxSeats[i][j] = eng + (j + 1);
            }
        }
        imaxSeats[3][7] = "__";
        imaxSeats[5][3] = "__";
        imaxSeats[7][5] = "__";
        imaxSeats[7][6] = "__";

        for (int i = 0; i < imaxSeats.length; i++) {
            for (int j = 0; j < imaxSeats[i].length; j++) {
                System.out.print(imaxSeats[i][j] + " ");
            }
            System.out.println();
        }

        //다차원 배열 합 구하기
        //3x3 크기 1부터 홀수 차례대로 넣고 출력해서 확인 후 총합 구하기
        int[][] arr = new int[3][5];
        int num = 1;
//        int n = arr[0].length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { //arr.length * n
//            arr[i/n][i%n] = i * 2 + 1;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num;
                num += 2;
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));

        System.out.println("총합 : " + sum);



        //각 행 합, 각 열 합, 전체 합
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int n = a.length;
        int m = a[0].length;
        int[] rowSum = new int[n];
        int[] colSum = new int[m];
        int total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rowSum[i] += a[i][j]; // [6, 15]
                colSum[j] += a[i][j]; // [5, 7, 9]
                total += a[i][j];
            }
        }
        System.out.println("row : " + Arrays.toString(rowSum));
        System.out.println("col : " + Arrays.toString(colSum));
        System.out.println("총합 : " + total);


        //A+B, A-B 값 구하기
        int[][] A = {{1, 2},{3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int n1 = A.length;
        int m1 = A[0].length;

        int[][] add = new int[n1][m1];
        int[][] sub = new int[n1][m1];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                add[i][j] = A[i][j] + B[i][j];
                sub[i][j] = A[i][j] - B[i][j];
            }
        }
        System.out.println("A+B = " + Arrays.deepToString(add));
        System.out.println("A-B = " + Arrays.deepToString(sub));


    }
}
