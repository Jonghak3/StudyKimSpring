package variable.ex;

public class Ex5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 "+max+"입니다.");

        String result = (a % 2 ==0) ? "짝수" : "홀수";
        System.out.println("a = " + a + ", " + result);
    }
}
