package _31_StringBuilder;

public class StringBuilder02 {
    public static void main(String[] args) {
        final int lengths = 500000;
        //String
        long startTime1 = System.currentTimeMillis(); //시작

        String str = "";
        for (int i = 0; i < lengths; i++) {
            str = str + "*";
        }

        long endTime1 = System.currentTimeMillis(); //끝
        long duration1 = endTime1 - startTime1;

        //StringBuffer
        long startTime2 = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < lengths; i++) {
            sb.append("*");
        }

        long endTime2 = System.currentTimeMillis();
        long duration2 = endTime2 - startTime2;

        //StringBuilder
        long startTime3 = System.currentTimeMillis();

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < lengths; i++) {
            sb2.append("*");
        }

        long endTime3 = System.currentTimeMillis();
        long duration3 = endTime3 - startTime3;

        System.out.println("String: " + duration1);
        System.out.println("StringBuffer: " + duration2);
        System.out.println("StringBuilder: " + duration3);
    }
}
