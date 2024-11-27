public class Quiz3_MultiplyMethod {
    public static void main(String[] args) {
        int num = 8;
        Multiply(num);
    }
    
    public static void Multiply(int num) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}