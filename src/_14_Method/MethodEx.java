package _14_Method;

public class MethodEx {
    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static boolean isEven(int num) {
//        if (num % 2 == 0) {
//            return true;
//        }
//        return false;
        return num % 2 == 0;
    }

    public static int abs(int n) {
        return n < 0 ? -n : n;
    }

    public static boolean contains(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //최댓값 구하기 (세 수를 전달)
        //max(3, 7, 5) => 7
        System.out.println(max(3, 5, 7));

        //홀짝 판단
        //isEven(8) => true (짝수면 true, 홀수면 false)
        System.out.println(isEven(8));

        //절댓값 구하기
        //삼항연산자 이용
        System.out.println(abs(8));


        //포함 여부 (선형탐색)
        //contains([1, 3, 5] , 3) => true, 없으면 false
        int[] nums = {1, 3, 7, 9};
        System.out.println(contains(nums, 8));
    }
}
